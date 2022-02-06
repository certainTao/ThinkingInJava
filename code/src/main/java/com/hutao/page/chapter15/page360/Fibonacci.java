package com.hutao.page.chapter15.page360;

import com.hutao.page.page596.Generator;

public class Fibonacci implements Generator<Integer> {
    private int count = 0;

    private int fib(int index) {
        if (index < 2) {
            return 1;
        }
        return fib(index - 2) + fib(index - 1);
    }

    public Integer next() {
        return fib(count++);
    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        for (int i = 0; i < 18; i++) {
            System.out.print(fibonacci.next()+" ");
        }
        System.out.println();
    }
}
