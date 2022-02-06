package com.hutao.exercise.page203;

interface I {
    void f();

    void g();

    //默认是public static的
    class Nested {
        static void call(I impl) {
            System.out.println("Calling I.f()");
            impl.f();
            System.out.println("Calling I.g()");
            impl.g();
        }
    }
}

public class E_21 {
    public static void main(String[] args) {
        I impl = new I() {
            public void f() {}

            public void g() {}
        };
        I.Nested.call(impl);
    }
}
