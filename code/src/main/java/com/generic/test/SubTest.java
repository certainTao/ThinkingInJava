package com.generic.test;

import com.generic.Father;
import com.generic.Son;

import java.util.ArrayList;
import java.util.List;

public class SubTest {
    public static void main(String[] args) {
        Father father = new Son();

        List<Father> fatherList = new ArrayList<Father>();
//        ArrayList<Father> fatherArrayList = new ArrayList<Son>();
        ArrayList sonArrayList = new ArrayList<Son>();
    }
}
