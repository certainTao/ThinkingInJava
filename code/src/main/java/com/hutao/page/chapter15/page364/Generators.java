package com.hutao.page.chapter15.page364;

import com.hutao.page.chapter15.page358.Coffee;
import com.hutao.page.chapter15.page358.CoffeeGenerator;
import com.hutao.page.page596.Generator;

import java.util.ArrayList;
import java.util.Collection;

public class Generators {
    public static <T> Collection<T> fill(Collection<T> collection, Generator<T> generator, int n) {
        for (int i = 0; i < n; i++) {
            collection.add(generator.next());
        }
        return collection;
    }

    public static void main(String[] args) {
        Collection<Coffee> coffees = fill(new ArrayList<Coffee>(),new CoffeeGenerator(),4);
        for (Coffee coffee : coffees) {
            System.out.println(coffee);
        }
    }
}
