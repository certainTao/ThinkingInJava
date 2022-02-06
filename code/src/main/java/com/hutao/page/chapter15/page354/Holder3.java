package com.hutao.page.chapter15.page354;

class Automobile {
}

public class Holder3<T> {
    private T a;

    public Holder3(T a) {
        this.a = a;
    }

    public void setA(T a) {
        this.a = a;
    }

    public T getA() {
        return a;
    }

    public static void main(String[] args) {
        Holder3<Automobile> automobileHolder = new Holder3<Automobile>(new Automobile());
        Automobile a = automobileHolder.getA();
        //automobileHolder.setA("Not a automobile");//Error
        //automobileHolder.setA(1);//Error
    }
}
