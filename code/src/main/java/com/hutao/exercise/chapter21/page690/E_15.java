package com.hutao.exercise.chapter21.page690;

import java.util.concurrent.TimeUnit;

import static com.hutao.util.Print.*;

class SingleSynch {
    public synchronized void f() {
        for (int i = 0; i < 5; i++) {
            print("f()");
            try {
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (InterruptedException ignore) {
            }
//            Thread.yield();
        }
    }

    public synchronized void g() {
        for (int i = 0; i < 5; i++) {
            print("g()");
            try {
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (InterruptedException ignore) {
            }
//            Thread.yield();
        }
    }

    public synchronized void h() {
        for (int i = 0; i < 5; i++) {
            print("h()");
            try {
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (InterruptedException ignore) {
            }
//            Thread.yield();
        }
    }
}

class TripleSynch {
    private Object syncObject1 = new Object();
    private Object syncObject2 = new Object();

    public synchronized void f() {
        for (int i = 0; i < 5; i++) {
            print("f()");
            try {
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (InterruptedException ignore) {
            }
//            Thread.yield();
        }
    }

    public void g() {
        synchronized (syncObject1) {
            for (int i = 0; i < 5; i++) {
                print("g()");
                try {
                    TimeUnit.MILLISECONDS.sleep(100);
                } catch (InterruptedException ignore) {
                }
//                Thread.yield();
            }
        }
    }

    public void h() {
        synchronized (syncObject2) {
            for (int i = 0; i < 5; i++) {
                print("h()");
                try {
                    TimeUnit.MILLISECONDS.sleep(100);
                } catch (InterruptedException ignore) {
                }
//                Thread.yield();
            }
        }
    }
}

public class E_15 {
    public static void main(String[] args) throws InterruptedException {
        print("Test single synchronization...");
        final SingleSynch singleSynch = new SingleSynch();
        Thread thread1 = new Thread() {
            public void run() {
                singleSynch.g();
            }
        };
        thread1.start();
        Thread thread2 = new Thread() {
            public void run() {
                singleSynch.h();
            }
        };
        thread2.start();
        singleSynch.f();
        thread1.join();
        thread2.join();

        print("Test triple synchronization...");
        final TripleSynch tripleSynch = new TripleSynch();
        new Thread() {
            public void run() {
                tripleSynch.g();
            }
        }.start();
        new Thread() {
            public void run() {
                tripleSynch.h();
            }
        }.start();
        tripleSynch.f();
    }
}
