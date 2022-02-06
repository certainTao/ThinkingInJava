package com.hutao.exercise.page101;

import java.util.Arrays;

class Test {
    Test(String arg) {
        System.out.println("The argument of Constructor: " + arg);
    }
}

public class E17 {
    public static void main(String[] args) {
        Test[] testArray = new Test[5];
        System.out.println(Arrays.toString(testArray));
    }
}
