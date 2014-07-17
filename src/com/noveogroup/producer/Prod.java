package com.noveogroup.producer;

import com.noveogroup.buffer.Buff;
import com.noveogroup.data.Data;
import com.noveogroup.main.Main;

import java.util.Random;

/**
 * Created by Admin on 17.07.2014.
 */
public class Prod implements Producer, Runnable {

    @Override
    public void produceData() throws InterruptedException {

        synchronized (Main.buffer) {

            while (Main.buffer.dataCount == Main.buffer.dataLimit) {
                System.out.println("I can't produce more data!");
                Main.buffer.wait();
            }

            Main.buffer.dataCount++;
            System.out.println("Data produce!");
            Main.buffer.notifyAll();
        }
    }

    @Override
    public void run() {
        while(true) {
            try {
                Thread.sleep(Random.);
                produceData();
            } catch (InterruptedException e) {
                System.out.println(e.toString());
            }
        }
    }
}
