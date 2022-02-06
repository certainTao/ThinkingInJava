package com.hutao.page.chapter15.page363;

import com.hutao.page.chapter15.page362.New;

import java.util.List;

public class LimitsOfInference {
    static void f(List<String> list){
    }

    public static void main(String[] args) {
        f(New.<String>list());
    }
}
