package com.hutao.exercise.chapter21.page660;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class RandomSleepTask implements Runnable {
    private static Random random = new Random();

    public void run() {
        int time = random.nextInt(10) + 1;
        try {
            TimeUnit.SECONDS.sleep(time);
            System.out.println(Thread.currentThread().getId() + "睡眠了" + time + "秒钟");
        } catch (InterruptedException e) {
            System.err.println(e);
        }
    }
}

public class E_6 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();
        for (int i = 0; i < 30; i++) {
            executor.execute(new RandomSleepTask());
        }
        executor.shutdown();
    }
}
