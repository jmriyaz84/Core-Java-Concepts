package com.synchronization.objectlock;

public class MultipleObjectSynchronizedDemo {
    public static void main(String[] args) {
        Display d1 = new Display();
        Display d2 = new Display();
        Display d3 = new Display();
        MyThread t1 = new MyThread(d1, "Mohammed");
        MyThread t2 = new MyThread(d2, "Riyaz");
        MyThread t3 = new MyThread(d3, "Ahmed");
        t1.start();
        t2.start();
        t3.start();
    }
}
