package com.hutao.exercise.page191;

class Outer {
    class Inner {

    }

    Inner getInner() {
        return new Inner();
    }
}

public class E1 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.getInner();
    }
}
