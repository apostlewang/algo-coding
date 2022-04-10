package com.interview.javabasic.thread;

public class ThreadTest {
    private static void attack() {
        System.out.println(Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        Thread t1 = new Thread(){
            @Override
            public void run() {
                attack();
            }
        };
        Thread t2 = new Thread(){
            @Override
            public void run() {
                attack();
            }
        };
        System.out.println(Thread.currentThread().getName());
        t1.run();
        // start底层是native方法，调用非JDK的源码
        t1.start();
        t2.start();
    }
}
