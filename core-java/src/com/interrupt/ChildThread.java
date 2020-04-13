package com.interrupt;

import java.util.stream.IntStream;

public class ChildThread extends Thread {
    @Override public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println("Child Thread got Executed for " + i + "th time");
        }
        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
