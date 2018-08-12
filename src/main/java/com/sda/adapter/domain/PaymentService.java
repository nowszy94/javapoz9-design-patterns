package com.sda.adapter.domain;

import java.util.List;
import java.util.Random;

public class PaymentService {
    private List<Payment> payments;

    public PaymentService(List<Payment> payments) {
        this.payments = payments;
    }

    public void requestPayment(int amountInPln) {
        Payment payment = randomPayment();
        payment.pay(amountInPln);
    }

    private Payment randomPayment() {
        Random random = new Random();
        int randomIndex = random.nextInt(payments.size());
        return payments.get(randomIndex);
    }
}
