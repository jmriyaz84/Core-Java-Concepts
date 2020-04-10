package com.multithread;

public class ChildThread implements  Runnable {

    @Override public void run() {
        Thread.currentThread().setName("Child Thread");
        Thread.currentThread().setPriority(10);
        System.out.println("Child Thread got executed");
    }
}
