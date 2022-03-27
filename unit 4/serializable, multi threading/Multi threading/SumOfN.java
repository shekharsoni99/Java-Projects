package com.thread;

public class SumOfN {
    public static void main(String[] args) {
        Sum sum = new Sum();

        Thread t = new Thread(sum);
        t.start();

        try {
            t.join();
            System.out.println("Sum is: " + sum.sum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


class Sum implements Runnable {

    int sum;

    @Override
    public void run() {

        for (int i = 1; i <= 10; i++){
            sum += i;
        }
    }
}
