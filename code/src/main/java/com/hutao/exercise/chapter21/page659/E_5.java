package com.hutao.exercise.chapter21.page659;

import java.util.ArrayList;
import java.util.concurrent.*;

class FibTask implements Callable<Integer> {
    private int count;

    public FibTask(int count) {
        this.count = count;
    }

    public int fib(int i) {
        if (1 == i || 2 == i) {
            return 1;
        }
        return fib(i - 2) + fib(i - 1);
    }

    public Integer call() {
        int sum = 0;
        for (int i = 1; i <= count; i++) {
            sum += fib(i);
        }
        return sum;
    }
}

public class E_5 {

    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        ArrayList<Future<Integer>> resultList = new ArrayList<Future<Integer>>();
        for (int i = 0; i < 9; i++) {
            resultList.add(exec.submit(new FibTask(i + 1)));
        }

        for (Future<Integer> resultFuture : resultList) {
            try {
                System.out.println("sum = " + resultFuture.get());
            } catch (InterruptedException e) {
                System.out.println(e);
                return;
            } catch (ExecutionException e) {
                System.out.println(e);
            } finally {
                exec.shutdown();
            }
        }
    }
}
