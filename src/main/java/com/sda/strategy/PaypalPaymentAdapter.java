package com.sda.strategy;

import com.sda.adapter.domain.Payment;
import com.sda.adapter.infrastructure.PaypalService;

public class PaypalPaymentAdapter implements Payment {

    private PaypalService paypalService;

    public PaypalPaymentAdapter(PaypalService paypalService) {
        this.paypalService = paypalService;
    }

    @Override
    public void pay(int amountInPln) {
        paypalService.logInToPaypal();
        paypalService.depositToPaypalAccount(amountInPln);
        paypalService.requestPayment("", "", 5);
    }
}
