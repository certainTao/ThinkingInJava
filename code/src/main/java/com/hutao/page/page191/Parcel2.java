package com.hutao.page.page191;

public class Parcel2 {
    //未指定权限修饰符，默认是包访问权限
    class Contents {
        private int i = 11;

        public int value() {
            return i;
        }
    }

    //未指定权限修饰符，默认是包访问权限
    class Destination {
        private String label;

        Destination(String whereTo) {
            label = whereTo;
        }

        String readLabel() {
            return label;
        }
    }

    public Destination to(String s) {
        return new Destination(s);
    }

    public Contents contents() {
        return new Contents();
    }

    public void ship(String dest) {
        Contents c = new Contents();
        Destination d = new Destination(dest);
        System.out.println(d.readLabel());
    }

    public static void main(String[] args) {
        Parcel2 p = new Parcel2();
        p.ship("Tasmania");
        Parcel2.Contents c = p.contents();
        Parcel2.Destination d = p.to("Borneo");
    }
}
