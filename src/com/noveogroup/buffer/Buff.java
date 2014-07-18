package com.noveogroup.buffer;

import com.noveogroup.data.*;

import java.util.ArrayList;

/**
 * Created by Admin on 17.07.2014.
 */
public class Buff implements Buffer {

    public ArrayList<Data> products;
    public int dataLimit = 5;

    public Buff() {
        products = new ArrayList<Data>();
    }

    @Override
    public boolean giveData(Data data) {
        if (products.size() < dataLimit) {
            products.add(data);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Data takeData() {
        if (products.size() > 0) {
            return products.remove(0);
        } else {
            return null;
        }
    }

}