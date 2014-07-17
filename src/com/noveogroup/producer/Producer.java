package com.noveogroup.producer;

import com.noveogroup.data.Data;

/**
 * Class which produces elements
 */
public interface Producer {
    void produceData() throws InterruptedException;
}
