package com.hutao.page.chapter21.page655;

import com.hutao.page.chapter21.page654.LiftOff;

public class MoreBasicThreads {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(new LiftOff()).start();
        }
        System.out.println("Waiting for LiftOff");
    }
}
