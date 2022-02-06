package com.generic.test;

import com.generic.RedBall;

import java.lang.reflect.Array;

public class Generator<T> {
    public T create(Class<T> type) {
        try {
            return type.newInstance();
        } catch (Exception e) {
            return null;
        }
    }

    public static void main(String[] args) {
        Generator<RedBall> generator = new Generator<RedBall>();
        RedBall redBall = generator.create(RedBall.class);
    }
}
