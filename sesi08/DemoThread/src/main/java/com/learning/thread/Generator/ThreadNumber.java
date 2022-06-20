package com.learning.thread.Generator;

public class ThreadNumber extends Thread {
    private final NumberGenerator ng;

    public ThreadNumber(NumberGenerator ng) {
        this.ng = ng;
    }

    @Override
    public void run() {
        callGenerator();
    }

    private void callGenerator() {
        // syncronized
        for (int i = 0; i < 3; i++) {
            System.out.println(getName() + " " + ng.randomNumber());
        }
    }
}