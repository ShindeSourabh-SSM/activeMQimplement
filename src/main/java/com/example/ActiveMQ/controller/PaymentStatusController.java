package com.example.ActiveMQ.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ActiveMQ.model.PaymentStatus;
import com.example.ActiveMQ.service.PaymentStatusProducer;

@RestController
@RequestMapping("/api/payment")
public class PaymentStatusController {

    private final PaymentStatusProducer producer;

    @Autowired
    public PaymentStatusController(PaymentStatusProducer producer) {
        this.producer = producer;
    }

    @PostMapping("/send")
    public String sendPaymentStatus(@RequestBody PaymentStatus paymentStatus) {
        producer.sendPaymentStatus(paymentStatus);
        return "Payment Status Sent Successfully!";
    }
}
