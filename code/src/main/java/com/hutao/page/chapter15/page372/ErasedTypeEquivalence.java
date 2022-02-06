package com.hutao.page.chapter15.page372;

import java.util.ArrayList;

public class ErasedTypeEquivalence {
    public static void main(String[] args) {
        Class class0 = new ArrayList<String>().getClass();
        Class class1 = new ArrayList<Integer>().getClass();
        System.out.println(class0 == class1);
    }
}
