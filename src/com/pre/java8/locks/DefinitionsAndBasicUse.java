package com.pre.java8.locks;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DefinitionsAndBasicUse {

    public static void main(String[] args) {

        Lock lock = new ReentrantLock();
        try{
            lock.lock();
        }
        finally {
            lock.unlock();
        }

        /**
         * Try lock demo
         */
        Lock tryLockDemo = new ReentrantLock();
        if(tryLockDemo.tryLock()) {

            try {
                System.out.println("Lock obtained....");

            } finally {
                tryLockDemo.unlock();
            }
        } else {
            System.out.println("Lock failure");
        }

        /**
         * tryLock(time,unit) demo
         */
        Lock tryFroTimeDemo = new ReentrantLock();
        try {
            //Try for time, CheckedException
            if(tryFroTimeDemo.tryLock(10, TimeUnit.SECONDS)) {

                try {
                    System.out.println("Lock obtained....");

                } finally {
                    tryFroTimeDemo.unlock();
                }
            } else {
                System.out.println("Lock failure");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        /**
         * Fairness can be passed into the constructor
         */
        Lock fairnessDemo = new ReentrantLock(true);

    }
}
