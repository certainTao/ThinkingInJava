package com.hutao.exercise.chapter21.page656;

class FibTask implements Runnable {
    private int num;

    public FibTask(int num) {
        this.num = num;
    }

    public void run() {
        for (int i = 1; i <= num; i++) {
            System.out.print(fib(i)+" ");
        }
        System.out.println();
    }

    private int fib(int i) {
        if (1 == i || 2 == i) {
            return 1;
        }
        return fib(i-1)+fib(i-2);
    }
}

public class E_2 {
    public static void main(String[] args) {
        Thread thread = new Thread(new FibTask(10));
        thread.start();
    }
}
