package com.interview.javabasic.thread;

// extends是继承
public class MyThread extends Thread{
    private String name;
    // 构造函数
    public MyThread(String name){
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(this.name + ",i="+i);
        }
    }
}
