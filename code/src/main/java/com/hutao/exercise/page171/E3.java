package com.hutao.exercise.page171;

abstract class BaseClass {
    public BaseClass(){
        print();
    }
    abstract void print();
}

class SubClass extends BaseClass {
    private int i = 1;

    void print() {
        System.out.println("i=" + i);
    }
}

public class E3{
    public static void main(String[] args) {
        SubClass subObject = new SubClass();
        subObject.print();
    }
}




