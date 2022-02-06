package com.hutao.page.chapter15.page366;

import com.hutao.page.chapter15.page355.ThreeTuple;
import com.hutao.page.chapter15.page355.TwoTuple;

public class Tuple {
    public static <A, B> TwoTuple<A, B> tuple(A a, B b) {
        return new TwoTuple<A, B>(a, b);
    }

    public static <A, B, C> ThreeTuple<A, B, C> tuple(A a, B b, C c){
        return new ThreeTuple<A, B, C>(a, b, c);
    }
}
