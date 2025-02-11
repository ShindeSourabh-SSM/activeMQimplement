package com.example.ActiveMQ.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import com.example.ActiveMQ.model.PaymentStatus;

@Service
public class PaymentStatusProducer {

    private final JmsTemplate jmsTemplate;

    @Autowired
    public PaymentStatusProducer(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    public void sendPaymentStatus(PaymentStatus paymentStatus) {
        jmsTemplate.convertAndSend("payment-status-queue", paymentStatus);
        System.out.println("Message Sent: " + paymentStatus);
    }
}
