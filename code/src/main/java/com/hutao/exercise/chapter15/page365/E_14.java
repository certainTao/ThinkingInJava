package com.hutao.exercise.chapter15.page365;


import com.hutao.page.chapter15.page365.BasicGenerator;
import com.hutao.page.chapter15.page365.CountObject;

public class E_14 {
    public static void main(String[] args) {
        BasicGenerator<CountObject> generator = new BasicGenerator<CountObject>(CountObject.class);
        for (int i = 0; i < 5; i++) {
            System.out.println(generator.next());
        }
    }
}
