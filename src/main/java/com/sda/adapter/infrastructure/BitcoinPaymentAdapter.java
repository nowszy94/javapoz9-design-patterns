package com.sda.adapter.infrastructure;

import com.sda.adapter.domain.Payment;

public class BitcoinPaymentAdapter implements Payment {

    private BitcoinServiceFacade bitcoinServiceFacade;

    public BitcoinPaymentAdapter(BitcoinServiceFacade bitcoinServiceFacade) {
        this.bitcoinServiceFacade = bitcoinServiceFacade;
    }

    @Override
    public void pay(int amountInPln) {
        bitcoinServiceFacade.requestPayment("", "", amountInPln);
    }

    private int changeFromPlnToUsd(int amountInPln) {
        return amountInPln / 3;
    }
}
