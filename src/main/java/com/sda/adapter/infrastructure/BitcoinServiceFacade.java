package com.sda.adapter.infrastructure;

public class BitcoinServiceFacade {

    private BitcoinService bitcoinService;

    public void requestPayment(String from, String to, int amount) {
        bitcoinService.logInToStock();
        bitcoinService.buyBitcoins(amount);
        bitcoinService.transferTo(from, to, amount);
    }

//    public void createOffer(String text) {
//        //pociac tekst na osobne sekcje
//        titleService.createWithTitle(split[0]);
//        descriptionService.createDescription(split[1]);
//        priceService.createPrice(split[2], split[3]);
//    }
}
