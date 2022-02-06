package com.hutao.page.page119;

import com.hutao.page.page119.cookie.Cookie2;

public class ChocolateChip2 extends Cookie2 {
    public ChocolateChip2(){
        System.out.println("ChocolateChip2 constructor");
    }

    public void chomp(){
        bite();//Protected method
    }

    public static void main(String[] args) {
        ChocolateChip2 chocolateChip2 = new ChocolateChip2();
        chocolateChip2.chomp();
    }
}
