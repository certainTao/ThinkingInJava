package com.hutao.exercise.chapter21.page694;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static com.hutao.util.Print.*;

class Count {
    private int count = 0;

    public synchronized void increment() {
        ++count;
    }

    public synchronized int getCount() {
        return count;
    }
}

class Sensor implements Runnable {
    private static Count count = new Count();
    private int number = 0;
    private static volatile boolean canceled = false;
    private int id;
    private static ArrayList<Sensor> sensors = new ArrayList<Sensor>();

    public Sensor(int id) {
        this.id = id;
        sensors.add(this);
    }

    public void run() {
        while (!canceled) {
            count.increment();
            ++number;
        }
    }

    public static void cancel() {
        canceled = true;
    }

    public static int getTotal() {
        return count.getCount();
    }

    public int getNumber() {
        return number;
    }

    public static int getSumOfNumber() {
        int sum = 0;
        for (Sensor sensor : sensors) {
            sum += sensor.getNumber();
        }
        return sum;
    }
}

public class E_17 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            exec.execute(new Sensor(i));
        }
        TimeUnit.SECONDS.sleep(3);
        Sensor.cancel();
        exec.shutdown();
        if (!exec.awaitTermination(250, TimeUnit.MILLISECONDS)) {
            print("Some tasks were not terminated!");
        }
        print("Total: " + Sensor.getTotal());
        print("Sum of sensors: " + Sensor.getSumOfNumber());
    }
}
