package com.noveogroup.consumer;

import com.noveogroup.data.Data;

/**
 * Class which consumes elements.
 */
public interface Consumer {
    Thread thread = null;
    void consumeData() throws InterruptedException;
}
