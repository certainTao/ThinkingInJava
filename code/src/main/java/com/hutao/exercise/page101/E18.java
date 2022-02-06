package com.hutao.exercise.page101;

import java.util.Arrays;

public class E18 {
    public static void main(String[] args) {
        Test[] testArray = new Test[5];
        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = new Test(Integer.toString(i));
        }

        System.out.println(Arrays.toString(testArray));
    }
}
