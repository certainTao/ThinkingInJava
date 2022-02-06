package com.hutao.page.chapter15.page358;

import com.hutao.page.page596.Generator;

import java.util.Iterator;
import java.util.Random;

public class CoffeeGenerator implements Generator<Coffee>, Iterable<Coffee> {
    private Class[] classArray = {Latte.class, Mocha.class, Cappuccino.class, Americano.class, Breve.class};
    private static Random random = new Random(47);
    private int count = 0;

    public CoffeeGenerator() {
    }

    public CoffeeGenerator(int count) {
        this.count = count;
    }

    public Coffee next() {
        try {
            return (Coffee) classArray[random.nextInt(classArray.length)].newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private class CoffeeIterator implements Iterator<Coffee> {
        public boolean hasNext() {
            return count > 0;
        }

        public Coffee next() {
            --count;
            return CoffeeGenerator.this.next();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public Iterator<Coffee> iterator() {
        return new CoffeeIterator();
    }

    public static void main(String[] args) {
        CoffeeGenerator coffeeGenerator = new CoffeeGenerator();
        for (int i = 0; i < 5; i++) {
            System.out.println(coffeeGenerator.next());
        }

        CoffeeGenerator coffeeGenerator1 = new CoffeeGenerator(10);
        for (Coffee coffee : coffeeGenerator1) {
            System.out.println(coffee);
        }
    }
}
