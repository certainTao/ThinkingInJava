package com.hutao.page.chapter15.page365;

import com.hutao.page.page596.Generator;

public class BasicGenerator<T> implements Generator<T> {

    private Class<T> type;

    public BasicGenerator(Class<T> type) {
        this.type = type;
    }

    public T next() {
        try {
            return type.newInstance();
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    public static <T> Generator<T> crate(Class<T> type) {
        return new BasicGenerator<T>(type);
    }
}
