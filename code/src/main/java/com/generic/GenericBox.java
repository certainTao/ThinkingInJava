package com.generic;

public class GenericBox<T> {
    private T ball;

    public T get() {
        return ball;
    }

    public void set(T ball) {
        this.ball = ball;
    }
}
