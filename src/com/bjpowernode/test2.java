package com.bjpowernode;

import jdk.management.resource.ResourceType;
import sun.rmi.server.InactiveGroupException;

import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class test2{


    private Lock lock = new ReentrantLock();
    private void methodd(Thread thread){
        lock.lock();
        try {
            System.out.println("线程"+thread.getName()+"获得了锁");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("线程"+thread.getName()+"释放了锁");
            lock.unlock();
        }

    }
    public static void main(String args[]) {
            test2 t = new test2();
            Thread t1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    t.methodd(Thread.currentThread());
                }
            },"t1");
    }
}
