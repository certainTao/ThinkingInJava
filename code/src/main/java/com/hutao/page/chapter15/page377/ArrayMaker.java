package com.hutao.page.chapter15.page377;

import java.lang.reflect.Array;
import java.util.Arrays;

class Dog{}
public class ArrayMaker<T> {
    private Class<T> kind;

    public ArrayMaker(Class<T> kind) {
        this.kind = kind;
    }

    T[] create(int size) {
        return (T[]) Array.newInstance(kind, size);
    }

    T createObject() {
        try {
            return kind.newInstance();
        } catch (Exception e) {
            return null;
        }
    }

    public static void main(String[] args) {
//        ArrayMaker<Dog> arrayMaker = new ArrayMaker<Dog>(Dog.class);
//        Dog[] array = arrayMaker.create(9);
//        System.out.println(Arrays.toString(array));
//
//        System.out.println(arrayMaker.createObject());


        Dog[] dogArray = (Dog[])Array.newInstance(Dog.class, 9);
        System.out.println(Arrays.toString(dogArray));

        Dog[] dogArray1 = new Dog[9];
        System.out.println(Arrays.toString(dogArray1));
    }

}
