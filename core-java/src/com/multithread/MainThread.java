package com.multithread;

/**
 * Main Thread
 */
public class MainThread {
    public static void main(String[] args) {
        ChildThread childThread = new ChildThread();
        Thread subThread = new Thread(childThread);
        subThread.start();
        System.out.println("Main Thread got Executed");
        Thread.currentThread().setName("Main Thread");
        Thread.currentThread().setPriority(5);

    }
}
