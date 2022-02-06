package com.hutao.page.chapter21.page700;

import static com.hutao.util.Print.*;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class BlockMutex {
    private Lock lock = new ReentrantLock();

    public BlockMutex() {
        lock.lock();
    }

    public void f() {
        try {
            lock.lockInterruptibly();
        } catch (InterruptedException e) {
            print("Interrupted from lock acquisition in f()");
        }
    }
}

class Block2 implements Runnable {
    BlockMutex blockMutex = new BlockMutex();

    public void run() {
        print("Waiting for f() in BlockedMutex");
        blockMutex.f();
        print("Broken out of block call");
    }
}

public class Interrupting {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Block2());
        thread.start();
        TimeUnit.SECONDS.sleep(1);
        print("Issuing t.interrupt");
        thread.interrupt();
    }
}
