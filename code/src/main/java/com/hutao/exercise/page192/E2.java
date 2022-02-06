package com.hutao.exercise.page192;

import com.hutao.page.page192.Selector;
import com.hutao.page.page192.Sequence;

class StringClass {
    private String str;

    StringClass(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "StringClass{" +
                "str='" + str + '\'' +
                '}';
    }
}

public class E2 {
    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        for (int i = 0; i < 10; i++) {
            sequence.add(new StringClass("string " + i));
        }

        Selector selector = sequence.selector();
        while (!selector.end()) {
            System.out.println(selector.current());
            selector.next();
        }
    }
}
