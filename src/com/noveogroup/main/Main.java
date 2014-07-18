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

    public static void main(String[] args) {

        int consumersCount = 3;
        int producersCount = 1;

        ArrayList<Cons> consumers = new ArrayList<Cons>();
        ArrayList<Prod> producers = new ArrayList<Prod>();

        for (int i = 0; i < consumersCount; i++) {
            consumers.add(new Cons());
        }
        for (int i = 0; i < producersCount; i++) {
            producers.add(new Prod());
        }
    }
}
