package com.example.ActiveMQ.model;

import java.io.Serializable;

public class PaymentStatus implements Serializable {
    private String txnRef;
    private String status;

    // Constructors
    public PaymentStatus() {}

    public PaymentStatus(String txnRef, String status) {
        this.txnRef = txnRef;
        this.status = status;
    }

    // Getters and Setters
    public String getTxnRef() {
        return txnRef;
    }

    public void setTxnRef(String txnRef) {
        this.txnRef = txnRef;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "PaymentStatus{" +
                "txnRef='" + txnRef + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
