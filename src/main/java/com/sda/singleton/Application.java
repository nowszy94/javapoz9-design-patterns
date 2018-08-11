package com.sda.singleton;

public class Application {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            new Thread(new MyAction()).start();
        }

        Thread.sleep(1000);

        System.out.println(Queue.instanceOf().getCounter());
    }
}

class MyAction implements Runnable {

    @Override
    public void run() {
        for (int j = 0; j < 100; j++) {
            Queue.instanceOf().increment();
        }
    }
}