package com.noveogroup.consumer;

import com.noveogroup.buffer.Buff;
import com.noveogroup.main.Main;

import java.lang.*;

/**
 * Created by Admin on 17.07.2014.
 */
public class Cons implements Consumer, Runnable {

    @Override
    public void consumeData() throws InterruptedException {
        synchronized (Main.buffer) {
            while (Main.buffer.dataCount <= 0) {
                System.out.println("I can't consume data, buffer is empty!");
                Main.buffer.wait();
            }

            Main.buffer.dataCount--;
            System.out.println("Data consume!");
            Main.buffer.notifyAll();
        }
    }

    @Override
    public void run() {
        while (true) {
            try {
                consumeData();
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e.toString());
            }
        }
    }
}
