package com.pre.java8.locks;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created by L078878 on 2/03/2017.
 */
public class ReadWriteLocksDemo {

    //Fairness can be passed
    private ReadWriteLock readWriteLock = new ReentrantReadWriteLock(true);
    private List<String> stringList = new ArrayList<>();

    public ReadWriteLocksDemo() {
        stringList.add("Some String");
        stringList.add("Other String");
        stringList.add("Another String");
    }

    private String readValues(int i) {

        Lock readLock = readWriteLock.readLock();
        try{
            //Locking the read lock
            readLock.lock();
            System.out.println("Read lock obtained......");
            return stringList.get(i % stringList.size());

        } finally {
            System.out.println("Read lock released ...");
            readLock.unlock();
        }
    }

    private void writeValue(String value) {

        Lock writeLock = readWriteLock.writeLock();
        try {
            writeLock.lock();
            System.out.println("Write lock obtained....");
            try {
                System.out.println(" <<< Writing value >>>> " + value);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            stringList.add(value);

        } finally {
            System.out.println("Write lock released....");
            writeLock.unlock();
        }
    }


    public static void main(String[] args) {

        ReadWriteLocksDemo readWriteLocksDemo = new ReadWriteLocksDemo();
        ExecutorService executorService = null;

        try{

            executorService = Executors.newFixedThreadPool(20);
            for (int i = 0; i< 100 ; i++) {
                final int id = i;
                executorService.submit( () -> readWriteLocksDemo.readValues(id));
                executorService.submit(() -> readWriteLocksDemo.writeValue("Writing value " + id + "..."));
            }

//            executorService.submit(() -> readWriteLocksDemo.writeValue("Writing value two..."));

        } finally {

            if(executorService != null) executorService.shutdown();

        }







    }
}
