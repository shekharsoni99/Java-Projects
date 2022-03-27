package com.thread;

public class Main {
    public static void main(String[] args) {

        RaceCondition raceCondition = new RaceCondition();
        Thread thread1 = new Thread(raceCondition, "thread 1");
        Thread thread2 = new Thread(raceCondition, "thread 2");

        thread1.start();
        thread2.start();

        for (int i = 20; i <= 25; i++) {
            System.out.println("Inside Main method: " + i);
        }
    }
}

class RaceCondition implements Runnable {

    @Override
    public synchronized void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Inside Race Condition method: " + i);
        }
    }
}