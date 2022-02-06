package com.hutao.page.chapter15.page355;

public class ThreeTuple1<C> extends TwoTuple<Integer, String> {
    public final C third;

    public ThreeTuple1(Integer first, String second, C third) {
        super(first, second);
        this.third = third;
    }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ", " + third + ")";
    }
}
