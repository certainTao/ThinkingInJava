package com.hutao.page.chapter21.page655;

import com.hutao.page.chapter21.page654.LiftOff;

public class BasicThreads {
    public static void main(String[] args) {
        Thread thread = new Thread(new LiftOff());
        thread.start();
        System.out.println("Waiting for LiftOff`");
    }
}
