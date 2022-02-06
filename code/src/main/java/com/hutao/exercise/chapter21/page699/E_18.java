package com.hutao.exercise.chapter21.page699;

import static com.hutao.util.Print.*;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

class NoTask {
    public void method() {
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            print("NoTask's method() was interrupted");
        }
    }
}

class Task implements Runnable {
    private NoTask noTask = new NoTask();

    public void run() {
        noTask.method();
    }
}

public class E_18 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService exec = Executors.newCachedThreadPool();
        Future<?> submit = exec.submit(new Task());
        print("Sent interrupt to task");
        submit.cancel(true);
        TimeUnit.SECONDS.sleep(3);
        print("Aborting with System.exit(0)");
        System.exit(0);
    }
}
