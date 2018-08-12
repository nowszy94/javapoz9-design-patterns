package com.sda.singleton;

public class Consumer implements Runnable {
    @Override
    public void run() {
        System.out.println("Consumer thread started at " + MyClock.instanceOf().getCurrentTimeAsString());
        for (int i = 0 ; i < 1000; i++) {
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Consumed: " + Queue.instanceOf().pop());
        }
    }
}
