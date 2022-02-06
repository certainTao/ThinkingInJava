package com.generic.test;

import com.generic.Father;
import com.generic.Son;

import java.util.ArrayList;

public class CovariantTest {
    public static void handle(ArrayList<? extends Father> fatherList){

    }

    public static void main(String[] args) {
        handle(new ArrayList<Father>());
        handle(new ArrayList<Son>());
    }
}
