package com.generic.test;

import com.generic.Father;
import com.generic.Son;

import java.io.Serializable;

public class Limit<T extends Father&Comparable>{

    public static void main(String[] args) {
        Limit<Son> fatherLimit = new Limit<Son>();
    }
}
