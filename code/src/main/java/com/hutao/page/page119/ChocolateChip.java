package com.hutao.page.page119;

import com.hutao.page.page117.dessert.Cookie;

public class ChocolateChip extends Cookie {
    public ChocolateChip(){
        System.out.println("ChocolateChip constructor");
    }

    public void chomp(){
//        bite();//Can't access bite
    }

    public static void main(String[] args) {
        ChocolateChip chocolateChip = new ChocolateChip();
        chocolateChip.chomp();
    }
}
