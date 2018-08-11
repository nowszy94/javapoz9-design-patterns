package com.sda.singleton;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class QueuePrototype {

    private static List<QueuePrototype> instances = Arrays.asList(null, null, null);

    public synchronized static QueuePrototype instanceOf(int i) {
        if (i >=0 && i < 3) {
            QueuePrototype instance = instances.get(i);
            if (instance == null) {
                instance = new QueuePrototype();
                instances.add(i, instance);
            }
            return instance;
        }
        return null;
    }

    private LinkedList<String> list = new LinkedList<>();
    private int counter = 0;

    private QueuePrototype() {
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
