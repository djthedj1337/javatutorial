package com.jin.rose;


public class ThreadTest {
    public static void main(String[] args) throws Exception {
        ExtendThread t1 = new ExtendThread("t1");
        ExtendThread t2 = new ExtendThread("t2");
        Thread t3 = new Thread (new RunnableThread("t3"));

        t1.setDaemon(true);
        t2.setDaemon(true);
        t3.setDaemon(true);

        System.out.println(" main: id=" + Thread.currentThread().getId());
        t1.start();
        t2.start();
        t3.start();

        System.out.println(" main: id=" + Thread.currentThread().getId() + ", complete kicking off threads");


        //t1.join();
        //t2.join();
        //t3.join();

        System.out.println("Threads executed and completed.");


    }
}
