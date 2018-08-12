package com.sda.adapter.infrastructure;

import com.sda.adapter.domain.Payment;

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
