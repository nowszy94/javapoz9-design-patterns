package com.sda.adapter;

import java.util.Arrays;

public class Appliaction {
    public static void main(String[] args) {
        BitcoinPaymentAdapter bitcoinPaymentAdapter =
                new BitcoinPaymentAdapter(new BitcoinService());

        PaypalPaymentAdapter paypalPaymentAdapter =
                new PaypalPaymentAdapter(new PaypalService());

        PaymentService paymentService = new PaymentService(
                Arrays.asList(bitcoinPaymentAdapter, paypalPaymentAdapter)
        );

        paymentService.requestPayment(10);
        paymentService.requestPayment(100);
        paymentService.requestPayment(50);
    }
}
