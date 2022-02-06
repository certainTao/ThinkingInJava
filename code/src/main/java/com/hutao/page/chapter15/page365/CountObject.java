package com.hutao.page.chapter15.page365;

public class CountObject {
    private static long count = 0;
    private final long id = count++;

    public long id() {
        return id;
    }

    public String toString() {
        return "CountedObject " + id;
    }
}
