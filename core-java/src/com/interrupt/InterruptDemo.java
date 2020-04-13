package com.interrupt;

import java.util.stream.IntStream;

/**
 * Deadlock Demo
 */
public class InterruptDemo {
    public static void main(String[] args) {
        ChildThread childThread = new ChildThread();
        childThread.start();
        childThread.interrupt();
        System.out.println("End of Main Method");
    }
}
