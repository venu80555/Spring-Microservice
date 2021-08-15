package com.microservice.paymentclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("v1/payment-client/")
public class PaymentClinet {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/getprice")
    public int getPrice() {
        return restTemplate.getForObject("http://PAYMENT-SERVICE/v1/payment-service/getprice", Integer.class);
    }
}
