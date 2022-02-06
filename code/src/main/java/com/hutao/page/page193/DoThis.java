package com.hutao.page.page193;

public class DoThis {
    void f() {
        System.out.println("DoThis.f()");
    }

    public class Inner {
        public DoThis outer() {
            //使用外围内类名.this获取外围类对象的引用
            return DoThis.this;
        }
    }

    public Inner inner() {
        return new Inner();
    }

    public static void main(String[] args) {
        DoThis doThis = new DoThis();
        DoThis.Inner inner = doThis.inner();
        DoThis outer = inner.outer();
        outer.f();
    }
}
