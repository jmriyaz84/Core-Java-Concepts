package com.synchronization.objectlock;

public class SingleObjectSynchronizedDemo {
    public static void main(String[] args) {
        Display d = new Display();
        MyThread t1 = new MyThread(d, "Mohammed");
        MyThread t2 = new MyThread(d, "Riyaz");
        MyThread t3 = new MyThread(d, "Ahmed");
        t1.start();
        t2.start();
        t3.start();
    }
}
