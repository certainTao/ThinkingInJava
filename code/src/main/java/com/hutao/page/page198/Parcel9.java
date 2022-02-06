package com.hutao.page.page198;

import com.hutao.page.page194.Destination;

public class Parcel9 {
    private String dest = "Tasmania";

    public Destination destination() {
        return new Destination() {
            private String label = dest;

            public String readLabel() {
                return label;
            }
        };
    }

    public static void main(String[] args) {
        Parcel9 p = new Parcel9();
        Destination d = p.destination();
        System.out.println(d.readLabel());
    }
}
