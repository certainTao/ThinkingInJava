package com.hutao.page.page592;

public enum Direction {
    //Java要求必须先定义enum实例，并以,分隔 ;结尾
    EAST(0,"东方"),
    SOUTH(1,"南方"),
    WEST(2,"西方"),
    NORTH(3,"北方");

    int code;
    String description;
    private Direction(int code, String description){
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public static void main(String[] args) {
        Direction[] values = Direction.values();
        for (Direction value : values) {
            System.out.println(value);
            System.out.println(value.getCode());
            System.out.println(value.getDescription());
            System.out.println("-------------");
        }
    }
}
