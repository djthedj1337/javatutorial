package com.jin.rose;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * this class is to demo the concepts of Critical region/section
 * race condition, thread-safety, synchronization...
 */
public class RaceCondition {
    static int primitiveInt = 0;
    static int primitiveIntWithNoSync = 0;
    static int primitiveIntWithSync = 0;

    static AtomicInteger atomicInt = new AtomicInteger(0);

    public static void main(String[] s) throws Exception {

        System.out.println("I am main thread with thread ID=" + Thread.currentThread().getId() );
        Thread[] allThreads = new Thread[2];
        Item si = new Item("anything");
        for (int i=0; i < allThreads.length; i++) {
            allThreads[i] = new MyThread("name" + i, si);
        }
        // at this point, all child threads are to state=START-ABLE
        for (int i=0; i < allThreads.length; i++) {
            allThreads[i].start();
        }
        // now all child threads are at "RUNNABLE" state

        for (int i=0; i < allThreads.length; i++) {
            allThreads[i].join();
        }
        // all child threads are done, let us check the values, what do we expect?
        System.out.println("primitiveInt=" + primitiveInt +
                            ", primitiveIntWithNoSync=" + primitiveIntWithNoSync +
                            ", primitiveIntWithSync=" + primitiveIntWithSync +
                            ", atomicInt=" + atomicInt +
                            ", si=" + si.get());
        System.out.println("main thread: all children is done, exit too");
    }


    // this method is not sync-ed, thus race condition here
    static void inc2() {
        primitiveIntWithNoSync++;  // ++ is not an atomic operation: read+update+write
    }

    // sync on the class object internally
    static synchronized void inc3() {
        primitiveIntWithSync++; // ++ is still not an atomic operation BUT with sync it can be: read+update+write
    }


    static class MyThread extends Thread {
        private String myName;
        private Item si;
        public MyThread(String name, Item si) {
            myName = name;
            this.si = si;
        }
        public void run() {
            // execute the incremental 1000 times
            for (int k= 0; k < 1000; k++) {
                primitiveInt++;
                inc2();
                inc3();
                atomicInt.incrementAndGet();
                si.update();
                //synchronized(RaceCondition.class){} and place si.update if you want si to be synchronized without changing the class itself
            }
            System.out.println("ID=" + Thread.currentThread().getId() + ", name=" + myName + " is Done");
        }
    }

    // not thread-safe class
    static class Item {
        private int i = 0;
        private String other = "anything";
        public Item(String any) {
            other = any;
        }
        public void update() {
            i++;
        }
        public int get() {
            return i;
        }
    }
}