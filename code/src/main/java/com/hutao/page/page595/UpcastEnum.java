package com.hutao.page.page595;
enum Search{
    HITHER, YON,
}

public class UpcastEnum {
    public static void main(String[] args) {
        Search[] values = Search.values();
        Enum e = Search.HITHER;

        for (Enum enumConstant : e.getClass().getEnumConstants()) {
            System.out.println(enumConstant);
        }
    }
}
