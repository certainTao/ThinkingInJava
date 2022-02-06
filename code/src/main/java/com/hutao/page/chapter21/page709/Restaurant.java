package com.hutao.page.chapter21.page709;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static com.hutao.util.Print.*;

class Meal {
    private final int orderNum;

    public Meal(int orderNum) {
        this.orderNum = orderNum;
    }

    public String toString() {
        return "Meal " + orderNum;
    }
}

class WaitPerson implements Runnable {
    private Restaurant restaurant;

    public WaitPerson(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public void run() {
        try {
            while (!Thread.interrupted()) {
                synchronized (this) {
                    while (null == restaurant.meal) {
                        wait();
                    }
                }
                print("Waitperson got " + restaurant.meal);
                synchronized (restaurant.chief) {
                    restaurant.meal = null;
                    restaurant.chief.notifyAll();
                }
            }
        } catch (InterruptedException e) {
            print("WaitPerson interrupted");
        }
    }
}

class Chief implements Runnable {
    private Restaurant restaurant;
    private int count = 0;

    public Chief(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public void run() {
        try {
            while (!Thread.interrupted()) {
                synchronized (this) {
                    while (null != restaurant.meal) {
                        wait();
                    }
                }
                if (++count == 10) {
                    print("Out of food.closing");
                    restaurant.exec.shutdownNow();
                }
                printnb("Order up!");
                synchronized (restaurant.waitPerson) {
                    restaurant.meal = new Meal(count);
                    restaurant.waitPerson.notifyAll();
                }
                TimeUnit.MILLISECONDS.sleep(100);
            }
        } catch (InterruptedException e) {
            print("Chief interrupted");
        }
    }
}

public class Restaurant {
    Meal meal;
    WaitPerson waitPerson = new WaitPerson(this);
    Chief chief = new Chief(this);
    ExecutorService exec = Executors.newCachedThreadPool();

    public Restaurant() {
        exec.execute(chief);
        exec.execute(waitPerson);
    }

    public static void main(String[] args) {
        new Restaurant();
    }
}
