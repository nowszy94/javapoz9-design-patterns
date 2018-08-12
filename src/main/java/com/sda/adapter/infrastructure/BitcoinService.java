package com.sda.adapter.infrastructure;

public class BitcoinService {
    public void logInToStock() {
        System.out.println("Logging to stock");
    }

    public void transferMoneyToStock(int moneyInUSD) {
        System.out.println("Transfering money to stock");
    }

    public void buyBitcoins(int moneyInUSD) {
        System.out.println("Buying some BTC");
    }

    public void transferTo(String from, String to, int amount) {
        System.out.println("transfering");
    }
}
