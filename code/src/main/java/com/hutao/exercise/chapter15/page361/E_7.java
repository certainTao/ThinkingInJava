package com.hutao.exercise.chapter15.page361;

import com.hutao.page.chapter15.page360.Fibonacci;

import java.util.Iterator;

class IterableFibonacci implements Iterable<Integer> {
    private int count = 0;
    private Fibonacci fibonacci = new Fibonacci();

    public IterableFibonacci(int count) {
        this.count = count;
    }

    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            public boolean hasNext() {
                return count > 0;
            }

            public Integer next() {
                --count;
                return fibonacci.next();
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
}

public class E_7 {
    public static void main(String[] args) {
        IterableFibonacci iterableFibonacci = new IterableFibonacci(18);
        for (Integer integer : iterableFibonacci) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }
}
