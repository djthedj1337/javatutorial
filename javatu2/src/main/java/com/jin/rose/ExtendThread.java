package com.jin.rose;

public class ExtendThread extends Thread {
    private Thread t;
    private String threadName;

    ExtendThread(String threadName){
        this.threadName = threadName;
        System.out.println("Creating thread: "+ threadName);
    }

    public void run(){
        System.out.println("Running " + threadName +". Thread ID: " + Thread.currentThread().getId());

        try {
            for (int i = 100; i > 0; i--) {
                System.out.println("Thread: " + threadName + ", Thread ID = " + Thread.currentThread().getId() + ", " + "value of i = " + i);
                Thread.sleep(50);
            }
        }catch (InterruptedException e){
            System.out.println("Thread " + threadName + " interrupted.");
        }
        System.out.println("Thread" + threadName + ", Thread ID = " + Thread.currentThread().getId() +  " exiting.");

    }

    public void start(){
        System.out.println("Starting " + threadName);
        if (t == null){
            //this constructor calls an object of the class thread, this method allows for instantiation of thread t is null aka not available
            t = new Thread (this, threadName);
            t.start();
        }
    }



}

