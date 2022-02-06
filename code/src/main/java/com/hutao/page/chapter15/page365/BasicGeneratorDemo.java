package com.hutao.page.chapter15.page365;

import com.hutao.page.page596.Generator;

public class BasicGeneratorDemo {
    public static void main(String[] args) {
        Generator<CountObject> generator = BasicGenerator.crate(CountObject.class);
        for (int i = 0; i < 5; i++) {
            System.out.println(generator.next());
        }
    }
}
