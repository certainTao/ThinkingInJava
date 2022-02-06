package com.hutao.exercise.chapter21.page699;

import static com.hutao.util.Print.*;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Counter {
    private int count = 0;
    private Random random = new Random(47);

    public synchronized void increment() {
        int temp = count;
        if (random.nextBoolean()) {
            Thread.yield();
        }
        count = temp + 1;
    }

    public synchronized int getCount() {
        return count;
    }
}

class Entrance implements Runnable {
    private int id;
    private int number = 0;
    private static ArrayList<Entrance> entranceArrayList = new ArrayList<Entrance>();
    private static Counter counter = new Counter();

    public Entrance(int id) {
        this.id = id;
        entranceArrayList.add(this);
    }

    public int getNumber() {
        return number;
    }

    public void run() {
        while (true) {
            number++;
            counter.increment();
            try {
                TimeUnit.MILLISECONDS.sleep(1);
            } catch (InterruptedException e) {
                print("Entrance # " + id + "was interrupted");
                return;
            }
        }
    }

    public static int getTotal() {
        return counter.getCount();
    }

    public static int getSum() {
        int sum = 0;
        for (Entrance entrance : entranceArrayList) {
            sum += entrance.getNumber();
        }
        return sum;
    }
}

public class E_19 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            exec.execute(new Entrance(i));
        }
        TimeUnit.SECONDS.sleep(10);
        exec.shutdownNow();
        if (!exec.awaitTermination(250, TimeUnit.MILLISECONDS)) {
            print("Some task were not terminated!");
        }
        print("Total: " + Entrance.getTotal());
        print("Sum: " + Entrance.getSum());
    }
}
