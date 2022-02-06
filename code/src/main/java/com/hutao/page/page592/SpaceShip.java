package com.hutao.page.page592;

public enum SpaceShip {
    SCOUT, CARGO, TRANSPORT, CRUISER, BATTLESHIP, MOTHERSHIP;

    //重载toString()方法并不影响name()
    @Override
    public String toString() {
        String id = name();
        String lower = id.substring(1).toLowerCase();
        return id.charAt(0)+lower;
    }

    public static void main(String[] args) {
        for (SpaceShip value : values()) {
            System.out.println(value);
            System.out.println(value.name());
            System.out.println("---------");
        }
    }
}
