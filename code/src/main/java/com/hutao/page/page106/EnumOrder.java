package com.hutao.page.page106;

public class EnumOrder {
    public static void main(String[] args) {
        for (Spiciness value : Spiciness.values()) {
            System.out.println(value+", ordinal "+value.ordinal());
        }
    }
}
