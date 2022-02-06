package com.hutao.page.page193;

public class DotNew {
    public class Inner{}

    public static void main(String[] args) {
        DotNew dot = new DotNew();
        DotNew.Inner inner = dot.new Inner();
    }
}
