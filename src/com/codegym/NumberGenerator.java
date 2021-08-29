package com.codegym;

public class NumberGenerator implements Runnable {

    @Override
    public void run() {
        try {
            for (int i = 1; i < 11; i++) {
                System.out.println("i = " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
