package com.synchronization.classlock;

public class Display {
    public static synchronized void wish(String name) {
        for (int i = 0; i < 10; i++) {
            System.out.print("Good Morning:");
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name);
        }
    }
}
