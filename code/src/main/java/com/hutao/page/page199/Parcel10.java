package com.hutao.page.page199;

import com.hutao.page.page194.Destination;

public class Parcel10 {
    public Destination destination(final String dest, final float price) {
        return new Destination() {
            private int cost;

            //使用代码块初始化cost字段。cost字段可直接被初始化，但是却不能像构造器一样对成员做其他处理（如if判断等）。
            {
                cost = Math.round(price);
                if (cost > 100) {
                    System.out.println("over budget!");
                }
            }

            private String label = dest;

            public String readLabel() {
                return label;
            }
        };
    }

    public static void main(String[] args) {
        Parcel10 p = new Parcel10();
        p.destination("Tasmania", 101.395f);
    }
}
