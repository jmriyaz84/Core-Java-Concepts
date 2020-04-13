package com.deadlock;

import java.util.stream.IntStream;

public class ChildThread extends  Thread {
    static Thread mt;

    @Override public void run() {
        IntStream.range(0, 10).forEach(i -> {
            try {
                mt.join();
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Child Thread got Executed for " + i + "th time");
        });
    }
}
