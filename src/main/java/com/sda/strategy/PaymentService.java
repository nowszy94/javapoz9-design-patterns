package com.sda.strategy;

import com.sda.adapter.domain.Payment;

import java.util.List;
import java.util.Random;

public class PaymentService {
    private List<Payment> payments;
    private PaymentStrategy paymentStrategy;

    public PaymentService(List<Payment> payments, PaymentStrategy paymentStrategy) {
        this.payments = payments;
        this.paymentStrategy = paymentStrategy;
    }

    public void requestPayment(PaymentModel paymentModel) {
        Payment payment = paymentStrategy.selectBestPayment(paymentModel, payments);
        payment.pay(paymentModel.getAmount());
    }
}
