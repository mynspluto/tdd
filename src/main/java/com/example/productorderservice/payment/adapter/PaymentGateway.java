package com.example.productorderservice.payment.adapter;

public interface PaymentGateway {

    void execute(int totalPrice, String cardNumber);
}
