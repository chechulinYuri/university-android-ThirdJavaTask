package com.noveogroup.producer;

import com.noveogroup.main.Main;
import com.noveogroup.data.*;

/**
 * Created by Admin on 17.07.2014.
 */
public class Prod implements Producer, Runnable {

    private Thread thread;

    public Prod() {
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void produceData() throws InterruptedException {

        synchronized (Main.buffer) {

            while (!Main.buffer.giveData(new Product())) {
                System.out.println("I can't produce more data, buff is full!");
                Main.buffer.wait();
            }

            System.out.println("Data produce!");
            Main.buffer.notifyAll();
        }
    }

    @Override
    public void run() {
        while(true) {
            try {
                Thread.sleep(1000);
                produceData();
            } catch (InterruptedException e) {
                System.out.println(e.toString());
            }
        }
    }
}
