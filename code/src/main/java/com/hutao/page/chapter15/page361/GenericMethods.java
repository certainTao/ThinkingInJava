package com.hutao.page.chapter15.page361;

public class GenericMethods {
    public <T> void f(T x) {
        System.out.println(x.getClass().getName());
    }

    public static void main(String[] args) {
        GenericMethods genericMethods = new GenericMethods();
        genericMethods.f(""); //形参为（T x），传入的实参类型为String，所以推断出类型参数T为String
        genericMethods.f(1);  //形参为（T x），传入的实参类型为Integer，所以推断出类型参数T为Integer
        genericMethods.f(1.0);
        genericMethods.f(1.0f);
        genericMethods.f('c');
        genericMethods.f(genericMethods);
    }
}
