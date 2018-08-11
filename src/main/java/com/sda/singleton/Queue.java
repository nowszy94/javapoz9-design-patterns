package com.sda.singleton;

import java.util.LinkedList;

public class Queue {

    private static Queue instance;

    public synchronized static Queue instanceOf() {
        if (instance == null) {
            instance = new Queue();
        }
        return instance;
    }

    private LinkedList<String> list = new LinkedList<>();
    private int counter = 0;

    private Queue() {
    }

    public synchronized void increment() {
        counter++;
    }

    public void push(String message) {
        System.out.println("Recived message");
        System.out.println("Current queue size: " + list.size());
        list.push(message);
    }

    public String pop() {
        System.out.println("Message was consumed");
        System.out.println("Current queue size: " + list.size());
        return list.poll();
    }

    public int getCounter() {
        return counter;
    }
}
