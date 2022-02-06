package com.hutao.exercise.page181;

import static com.hutao.util.Print.*;

interface A{
    void a1();
    void a2();
}

interface B{
    void b1();
    void b2();
}

interface C{
    void c1();
    void c2();
}

interface D extends A, B, C{
    void d1();
}

class Concrete{
    private String s;
    public Concrete(String s){
        this.s = s;
    }
}

class All extends Concrete implements D{
    public All(){
        super("All");
    }

    public void a1() {
        print("All.a1");
    }

    public void a2() {
        print("All.a2");
    }

    public void b1() {
        print("All.b1");
    }

    public void b2() {
        print("All.b2");
    }

    public void c1() {
        print("All.c1");
    }

    public void c2() {
        print("All.c2");
    }

    public void d1() {
        print("All.d1");
    }
}

public class E14 {
    static void aMethod(A a){
        a.a1();
        a.a2();
        print();
    }

    static void bMethod(B b){
        b.b1();
        b.b2();
        print();
    }

    static void cMethod(C c){
        c.c1();
        c.c2();
        print();
    }

    static void dMethod(D d){
        d.a1();
        d.a2();
        d.b1();
        d.b2();
        d.c1();
        d.c2();
        d.d1();
        print();
    }

    public static void main(String[] args) {
        All all = new All();
        aMethod(all);
        bMethod(all);
        cMethod(all);
        dMethod(all);
    }
}
