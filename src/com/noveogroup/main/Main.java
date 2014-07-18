package com.noveogroup.main;

import com.noveogroup.consumer.Cons;
import com.noveogroup.consumer.Consumer;
import com.noveogroup.producer.Prod;
import com.noveogroup.buffer.Buff;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static Buff buffer = new Buff();
    private static int consumersCount = 3;
    private static int producersCount = 1;

    public static void main(String[] args) {

        ArrayList<Cons> consumers = new ArrayList<Cons>();
        ArrayList<Prod> producers = new ArrayList<Prod>();

        for (int i = 0; i < consumersCount; i++) {
            consumers.add(new Cons());
            consumers.get(i).thread = new Thread(consumers.get(i));
            consumers.get(i).thread.start();
        }
        for (int i = 0; i < producersCount; i++) {
            producers.add(new Prod());
            producers.get(i).thread = new Thread(producers.get(i));
            producers.get(i).thread.start();
        }

    }
}
