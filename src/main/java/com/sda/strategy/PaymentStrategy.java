package com.sda.strategy;

import com.sda.adapter.domain.Payment;

import java.util.List;

public class PaymentStrategy {

    public Payment selectBestPayment(PaymentModel paymentModel, List<Payment> payments) {
        if ("BTC".equalsIgnoreCase(paymentModel.getPreferredMode())) {
            return payments.get(0);
        } else if ("PLN".equalsIgnoreCase(paymentModel.getPreferredMode())) {
            return payments.get(1);
        }
        if (paymentModel.getTo().length() > 20) {
            return payments.get(1);
        }
        return payments.get(0);
    }
}
