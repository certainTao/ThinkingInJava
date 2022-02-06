package com.hutao.exercise.page123.connection;

public class Connection {
    private static int counter = 0;
    private final int id = counter++;

    Connection(){}

    @Override
    public String toString() {
        return "Connection{" +
                "id=" + id +
                '}';
    }
}
