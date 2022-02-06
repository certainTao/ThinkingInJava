package com.hutao.page.chapter21.page701;

import java.util.concurrent.TimeUnit;

import static com.hutao.util.Print.*;

class NeedsCleanUp {
    private int id;

    public NeedsCleanUp(int id) {
        this.id = id;
        print("NeedsCleanUp " + id + ": needs clean up");
    }

    public void clean() {
        print("NeedsCleanUp " + id + ": was clean up");
    }
}

class Block implements Runnable {
    private volatile double d = 0.0;

    public void run() {
        try {
            while (!Thread.interrupted()) {
                NeedsCleanUp n1 = new NeedsCleanUp(1);
                try {
                    print("Start sleep 1 second");
                    TimeUnit.SECONDS.sleep(1);
                    NeedsCleanUp n2 = new NeedsCleanUp(2);
                    try {
                        for (int i = 0; i < 2500000; i++) {
                            d = (Math.PI + Math.E) / d;
                        }
                    } finally {
                        n2.clean();
                    }
                } finally {
                    n1.clean();
                }
            }
            print("Exit via while");
        } catch (InterruptedException e) {
            print("Exit via InterruptedException");
        }
    }
}

public class InterruptingIdiom {
    public static void main(String[] args) throws InterruptedException {
        if (1 != args.length) {
            print("miss the param");
        }
        Thread thread = new Thread(new Block());
        thread.start();
        TimeUnit.MILLISECONDS.sleep(Integer.parseInt(args[0]));
        thread.interrupt();
    }
}
