package com.hutao.page.page201;

import com.hutao.page.page194.Contents;
import com.hutao.page.page194.Destination;

public class Parcel11 {
    private static class ParcelContents implements Contents {
        private int i = 11;

        public int value() {
            return i;
        }
    }

    protected static class ParcelDestination implements Destination {
        private String label;

        private ParcelDestination(String whereTo) {
            label = whereTo;
        }

        private static String test = "test";

        public String readLabel() {
            return label;
        }

        //Nested classes can contain other static elements.
        public static void f() {
        }

        static int x = 10;

        static class AnotherLevel {
            public static void f() {
            }

            static int x = 10;
        }
    }

    public static Destination destination(String s) {
        //外围类直接访问内部类的私有成员
        ParcelDestination parcelDestination = new ParcelDestination(s);
        System.out.println(parcelDestination.label);
        System.out.println(ParcelDestination.test);
        return parcelDestination;
    }

    public static Contents contents() {
        return new ParcelContents();
    }

    public static void main(String[] args) {
        Contents c = contents();
        Destination d = destination("Tasmania");
        System.out.println(d.readLabel());
    }
}
