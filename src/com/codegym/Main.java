package com.codegym;

import static java.lang.Thread.*;

public class Main {

    public static void main(String[] args) {
        NumberGenerator numberGenerator = new NumberGenerator();
        Thread.currentThread().setPriority(MAX_PRIORITY);
        Thread thread1 = new Thread(numberGenerator);
        Thread.currentThread().setPriority(MIN_PRIORITY );
        Thread thread2 = new Thread(numberGenerator);

        System.out.println("Thread 1: ");
        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread 2: ");
        thread2.start();
    }
}
