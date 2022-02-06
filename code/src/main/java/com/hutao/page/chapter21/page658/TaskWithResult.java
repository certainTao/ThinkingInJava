package com.hutao.page.chapter21.page658;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class TaskWithResult implements Callable<String> {
    private int id;

    public TaskWithResult(int id) {
        this.id = id;
    }

    public String call() throws InterruptedException {
        Thread.sleep(5000);
        return "result of TaskWithResult" + id;
    }
}
