package com.hutao.test.page709;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static com.hutao.util.Print.*;

class Meal {
    private int id;

    public Meal(int id) {
        this.id = id;
    }

    public String toString() {
        return "Meal " + id;
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
                    if (null == restaurant.meal) {
                        wait();
                    }
                }
                print("WaitPerson got " + restaurant.meal);
                synchronized (restaurant.chief) {
                    restaurant.meal = null;
                    restaurant.chief.notify();
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
                    if (null != restaurant.meal) {
                        wait();
                    }
                }
                if (10 == ++count) {
                    print("Out of food, closing");
                    restaurant.exec.shutdownNow();
                }
                synchronized (restaurant.waitPerson) {
                    restaurant.meal = new Meal(count);
                    restaurant.waitPerson.notify();
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
    Chief chief = new Chief(this);
    WaitPerson waitPerson = new WaitPerson(this);
    ExecutorService exec = Executors.newCachedThreadPool();

    public Restaurant() {
        exec.execute(chief);
        exec.execute(waitPerson);
    }

    public static void main(String[] args) {
        new Restaurant();
    }
}
