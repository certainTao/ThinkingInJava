package com.hutao.exercise.chapter21.page690;

import static com.hutao.util.Print.*;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class SingleLockSynch {
    private Lock lock = new ReentrantLock();

    public void f() {
        lock.lock();
        try {
            for (int i = 0; i < 5; i++) {
                print("f()");
                try {
                    TimeUnit.MILLISECONDS.sleep(100);
                } catch (InterruptedException ignore) {
                }
            }
        } finally {
            lock.unlock();
        }
    }

    public void g() {
        lock.lock();
        try {
            for (int i = 0; i < 5; i++) {
                print("g()");
                try {
                    TimeUnit.MILLISECONDS.sleep(100);
                } catch (InterruptedException ignore) {
                }
            }
        } finally {
            lock.unlock();
        }
    }

    public void h() {
        lock.lock();
        try {
            for (int i = 0; i < 5; i++) {
                print("h()");
                try {
                    TimeUnit.MILLISECONDS.sleep(100);
                } catch (InterruptedException ignore) {
                }
            }
        } finally {
            lock.unlock();
        }
    }
}

class TripleLockSynch {
    private Lock lockF = new ReentrantLock();
    private Lock lockG = new ReentrantLock();
    private Lock lockH = new ReentrantLock();

    public void f() {
        lockF.lock();
        try {
            for (int i = 0; i < 5; i++) {
                print("f()");
                try {
                    TimeUnit.MILLISECONDS.sleep(100);
                } catch (InterruptedException ignore) {
                }
            }
        } finally {
            lockF.unlock();
        }
    }

    public void g() {
        lockG.lock();
        try {
            for (int i = 0; i < 5; i++) {
                print("g()");
                try {
                    TimeUnit.MILLISECONDS.sleep(100);
                } catch (InterruptedException ignore) {
                }
            }
        } finally {
            lockG.unlock();
        }
    }

    public void h() {
        lockH.lock();
        try {
            for (int i = 0; i < 5; i++) {
                print("h()");
                try {
                    TimeUnit.MILLISECONDS.sleep(100);
                } catch (InterruptedException ignore) {
                }
            }
        } finally {
            lockH.unlock();
        }
    }
}

public class E_16 {
    public static void main(String[] args) throws InterruptedException {
        print("Test single synchronization...");
        final SingleLockSynch singleLockSynch = new SingleLockSynch();
        Thread thread1 = new Thread() {
            public void run() {
                singleLockSynch.g();
            }
        };
        thread1.start();
        Thread thread2 = new Thread() {
            public void run() {
                singleLockSynch.h();
            }
        };
        thread2.start();
        singleLockSynch.f();
        thread1.join();
        thread2.join();

        print("Test triple synchronization...");
        final TripleLockSynch tripleLockSynch = new TripleLockSynch();
        new Thread() {
            public void run() {
                tripleLockSynch.g();
            }
        }.start();
        new Thread() {
            public void run() {
                tripleLockSynch.h();
            }
        }.start();
        tripleLockSynch.f();
    }
}
