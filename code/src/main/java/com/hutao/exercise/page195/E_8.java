package com.hutao.exercise.page195;

class Outer1 {
    private String name = "Outer";

    class Inner {
        private String name = "Inner";

        public String getOuterName() {
            return Outer1.this.name;
        }
    }

    public String getInnerName() {
        Inner inner = new Inner();
        return inner.name;
    }
}

public class E_8 {
    public static void main(String[] args) {
        Outer1 outer = new Outer1();
        System.out.println(outer.getInnerName());
        Outer1.Inner inner = outer.new Inner();
        System.out.println(inner.getOuterName());
    }
}
