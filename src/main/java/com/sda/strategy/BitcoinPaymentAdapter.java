package com.sda.strategy;

import com.sda.adapter.domain.Payment;
import com.sda.adapter.infrastructure.BitcoinService;

public class BitcoinPaymentAdapter implements Payment {

    private BitcoinService bitcoinService;

    public BitcoinPaymentAdapter(BitcoinService bitcoinService) {
        this.bitcoinService = bitcoinService;
    }

    @Override
    public void pay(int amountInPln) {
        bitcoinService.logInToStock();
        int moneyInUSD = changeFromPlnToUsd(amountInPln);
        bitcoinService.transferMoneyToStock(moneyInUSD);
        bitcoinService.buyBitcoins(moneyInUSD);
        bitcoinService.transferTo("", "", 5);
    }

    private int changeFromPlnToUsd(int amountInPln) {
        return amountInPln / 3;
    }
}
