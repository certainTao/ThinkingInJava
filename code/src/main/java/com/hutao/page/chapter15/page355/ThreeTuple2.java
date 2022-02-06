package com.hutao.page.chapter15.page355;

public class ThreeTuple2<B, C> extends TwoTuple<Integer, B>{
    public final C third;

    public ThreeTuple2(Integer first, B second, C third) {
        super(first, second);
        this.third = third;
    }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ", " + third + ")";
    }
}
