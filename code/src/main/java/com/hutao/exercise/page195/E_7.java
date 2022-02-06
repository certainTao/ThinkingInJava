package com.hutao.exercise.page195;

class Outer {
    private String name = "Outer";

    public String getName() {
        return name;
    }

    public void ModifyName() {
        name = name + " modified by outer";
    }

    class Inner {
        public void modifyOuterName() {
            name = name + " modified by inner";
            ModifyName();
        }
    }

    public void test() {
        Inner inner = new Inner();
        inner.modifyOuterName();
        System.out.println(name);
    }
}

public class E_7 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.test();
    }
}
