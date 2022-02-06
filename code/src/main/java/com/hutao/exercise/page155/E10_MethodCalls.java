package com.hutao.exercise.page155;

import static com.hutao.util.Print.*;

class TwoMethods {
    public void method1(){
        print("Base class's method1 call method2");
        method2();
    }

    public void method2(){
        print("Base class's method2 was called");
    }
}

class Inherited extends TwoMethods{
    @Override
    public void method2() {
        print("Inherited class's method2 was called");
    }
}

public class E10_MethodCalls{
    public static void main(String[] args) {
        TwoMethods twoMethods = new Inherited();
        twoMethods.method1();
    }
}
