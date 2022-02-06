package com.hutao.page.page85;

public class Flower {
    int petalCount = 0;
    String s = "initial value";

    Flower(int petalCount){
        this.petalCount = petalCount;
        System.out.println("Constructor String arg only, petalCount = "+petalCount);
    }

    Flower(String s){
        this.s = s;
    }

    Flower(int petalCount, String s){
        this(petalCount);
        this.s =s;
    }

    Flower(){
        this(47,"hi");
        System.out.println("Default constructor (no args)");
    }

    void printPetalCount(){
//        this(11);
        System.out.println("petalCount = "+petalCount+" s = "+s);
    }

    public static void main(String[] args) {
        Flower flower = new Flower();
        flower.printPetalCount();
    }
}
