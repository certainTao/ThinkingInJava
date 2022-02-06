package com.hutao.exercise.page130;

import static com.hutao.util.Print.*;

class A{
    A(){
        print("A constructor");
    }
}

class B{
    B(){
        print("B constructor");
    }
}

class C extends A{
    B b = new B();
}

public class E5 {
    public static void main(String[] args) {
        C c = new C();
    }
}
