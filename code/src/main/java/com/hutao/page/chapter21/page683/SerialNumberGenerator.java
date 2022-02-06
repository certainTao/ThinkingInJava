package com.hutao.page.chapter21.page683;

public class SerialNumberGenerator {
    private static volatile int serialNumber = 0;

    public static synchronized int nextSerialNumber() {
        return serialNumber++;// Not thread-safe
    }
}
