package com.hutao.exercise.chapter21.page684;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class AtomicityTest implements Runnable {
    private int i = 0;

    public synchronized int getValue() {
        return i;
    }

    public synchronized void evenIncrement() {
        i++;
        i++;
    }

    public void run() {
        while (true) {
            evenIncrement();
        }
    }
}

public class E_12 {
    public static void main(String[] args) {
        AtomicityTest at = new AtomicityTest();
        ExecutorService exec = Executors.newCachedThreadPool();
        exec.execute(at);
        Thread.yield();
        while (true) {
            int value = at.getValue();
            if (0 != value % 2) {
                System.out.println(value);
                System.exit(0);
            }
        }
    }
}
