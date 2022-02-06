package com.hutao.exercise.page192;

class Outer {
    String name;

    Outer(String name) {
        this.name = name;
    }

    class Inner {
        String getOuterName(){
            return name;
        }
    }

    Inner getInner() {
        return new Outer.Inner();
    }
}

public class E3 {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer("Outer").getInner();
        System.out.println(inner.getOuterName());
    }
}
