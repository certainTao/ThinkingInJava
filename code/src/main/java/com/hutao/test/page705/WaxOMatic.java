package com.hutao.test.page705;

import static com.hutao.util.Print.*;

class Car {
    private boolean wax = false;

    public synchronized void wax() throws InterruptedException {
        if (wax) {
            print("准备打蜡，但发现未抛光，等待...");
            wait();
        }
        wax = true;
        print("打蜡成功!通知其他线程抛光");
        notifyAll();
    }

    public synchronized void polish() throws InterruptedException {
        if (!wax) {
            print("准备抛光，但发现未打蜡，等待...");
            wait();
        }
        wax = false;
        print("抛光成功!通知其他线程打蜡");
        notifyAll();
    }
}

class WaxTask implements Runnable {
    private Car car;

    public WaxTask(Car car) {
        this.car = car;
    }

    public void run() {
        try {
            while (true) {
                car.wax();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class PolishTask implements Runnable {
    private Car car;

    public PolishTask(Car car) {
        this.car = car;
    }

    public void run() {

        try {
            while (true) {
                car.polish();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class WaxOMatic {
    public static void main(String[] args) {
        Car car = new Car();
        Thread waxThread = new Thread(new WaxTask(car));
        Thread polishThread = new Thread(new PolishTask(car));
        waxThread.start();
        polishThread.start();
    }
}
