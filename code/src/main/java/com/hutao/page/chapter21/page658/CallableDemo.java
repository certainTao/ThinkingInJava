package com.hutao.page.chapter21.page658;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        ArrayList<Future<String>> resultList = new ArrayList<Future<String>>();
        for (int i = 0; i < 5; i++) {
            resultList.add(exec.submit(new TaskWithResult(i)));
        }
        for (Future<String> result : resultList) {
            try {
                System.out.println(result.get());
            } catch (InterruptedException e) {
                System.out.println(e);
                return;
            } catch (ExecutionException e) {
                System.out.println(e);
            } finally {
                exec.shutdown();
            }
        }
    }
}
