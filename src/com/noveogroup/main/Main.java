package com.noveogroup.main;

import com.noveogroup.consumer.Cons;
import com.noveogroup.producer.Prod;
import com.noveogroup.buffer.Buff;

public class Main {

    public static Buff buffer = new Buff();

    public static void main(String[] args) {

        Cons consumer = new Cons();
        Thread consumerThread = new Thread(consumer);
        consumerThread.start();

        Prod producer = new Prod();
        Thread producerThread = new Thread(producer);
        producerThread.start();

    }
}
