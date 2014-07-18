package com.noveogroup.buffer;

import com.noveogroup.data.Data;

/**
 * Data buffer.
 */
public interface Buffer {
    boolean giveData(Data data);
    Data takeData();
}
