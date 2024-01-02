package com.corejavaoverridescene;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadSafety{

//    int count;
    AtomicInteger count=new AtomicInteger();

    //synchronized
    public  void increaseCount(){
        count.incrementAndGet();
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadSafety ts1 = new ThreadSafety();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
                for(int i=1;i<=1000;i++){
                    ts1.increaseCount();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
                for(int i=1;i<=1000;i++){
                    ts1.increaseCount();
                }
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(ts1.count);
    }
}
