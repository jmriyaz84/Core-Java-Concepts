package com.deadlock;

import java.util.stream.IntStream;

/**
 * Deadlock Demo
 */
public class DeadLockDemo {
    public static void main(String[] args) throws InterruptedException {
        ChildThread.mt=Thread.currentThread();
        ChildThread childThread = new ChildThread();
        childThread.start();
        childThread.join();
        IntStream.range(0, 10).forEach(i -> {
            System.out.println("Main Thread got Executed for " + i + "th time");
        });
    }
}
