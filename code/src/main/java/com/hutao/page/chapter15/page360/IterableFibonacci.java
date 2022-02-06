package com.hutao.page.chapter15.page360;

import java.util.Iterator;

public class IterableFibonacci extends Fibonacci implements Iterable<Integer> {
    private int count = 0;

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
                return IterableFibonacci.this.next();
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        for (Integer integer : new IterableFibonacci(18)) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }
}
