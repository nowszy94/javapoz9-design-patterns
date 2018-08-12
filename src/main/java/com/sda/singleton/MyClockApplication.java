package com.sda.singleton;

public class MyClockApplication {
    public static void main(String[] args) throws InterruptedException {
        Thread threadProducer = new Thread(new Producer());
        Thread threadProducer2 = new Thread(new Producer());
        Thread threadConsumer = new Thread(new Consumer());
        Thread threadConsumer2 = new Thread(new Consumer());

        threadProducer.start();
        Thread.sleep(1000);
        threadProducer2.start();
        Thread.sleep(1000);
        threadConsumer.start();
        Thread.sleep(1000);
        threadConsumer2.start();
    }
}
