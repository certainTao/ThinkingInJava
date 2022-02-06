package com.hutao.page.page197;

import com.hutao.page.page194.Contents;

public class Parcel7 {
    public Contents contents() {
        return new Contents() {
            private int i = 11;

            public int value() {
                return i;
            }
        };//Semicolon required in this case.
        //这里需要分号的原因可理解为：return语句的结束。
    }

    public static void main(String[] args) {
        Parcel7 p = new Parcel7();
        Contents c = p.contents();
        System.out.println(c.value());
    }
}
