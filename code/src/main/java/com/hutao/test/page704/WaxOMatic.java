package com.hutao.test.page704;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static com.hutao.util.Print.*;

class Car {
    private boolean waxOn = false;

    public synchronized void waxOn() throws InterruptedException {
        if (waxOn) {
            System.out.println("已经打蜡");
            notifyAll();
            wait();
            return;
        }
        waxOn = true;
        print("打蜡成功，通知抛光");
        notifyAll();
        while (waxOn) {
            wait();
        }
    }

    public synchronized void buffed() throws InterruptedException {
        if (!waxOn) {
            System.out.println("还未打蜡");
            notifyAll();
            wait();
            return;
        }
        waxOn = false;
        print("抛光成功，通知打蜡");
        notifyAll();
        while (!waxOn) {
            wait();
        }
    }
}

class WaxTask implements Runnable {
    private Car car;

    public WaxTask(Car car) {
        this.car = car;
    }

    public void run() {
        try {
            while (!Thread.interrupted()) {
                car.waxOn();
            }
        } catch (InterruptedException e) {
            print("Exiting wax task via interrupt");
        }
        print("Ending wax task");
    }
}

class BuffedTask implements Runnable {
    private Car car;

    public BuffedTask(Car car) {
        this.car = car;
    }

    public void run() {
        try {
            while (!Thread.interrupted()) {
                car.buffed();
            }
        } catch (InterruptedException e) {
            print("Exiting buffed task via interrupt");
        }
        print("Ending buffed task");
    }
}

public class WaxOMatic {
    public static void main(String[] args) throws InterruptedException {
        Car car = new Car();
        ExecutorService exec = Executors.newCachedThreadPool();
        exec.execute(new BuffedTask(car));
        exec.execute(new WaxTask(car));
        TimeUnit.MILLISECONDS.sleep(100);
        exec.shutdownNow();
        System.exit(1);
    }
}
