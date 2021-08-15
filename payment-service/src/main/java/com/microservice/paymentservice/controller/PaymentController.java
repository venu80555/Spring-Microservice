package com.microservice.paymentservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/payment-service/")
public class PaymentController {

    @GetMapping("/getprice")
    public double getPrice() {
        return 100.5;
    }
}
