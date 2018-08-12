package com.sda.adapter;

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
