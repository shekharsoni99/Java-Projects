package com.thread;

class RaceConditionDemo {
    public static void main(String[] args) {

        ThreadClass threadClass = new ThreadClass();

        Thread thread1 = new Thread(threadClass, "Thread 1");
        Thread thread2 = new Thread(threadClass, "Thread 2");
        Thread thread3 = new Thread(threadClass, "Thread 3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class ThreadClass implements Runnable {

    int c = 0;

    @Override
    public void run() {
        synchronized (this) {
            //if we remove this synchronized keyword this is called Race Condition, but using synchronized we are assuring mutually exclusive condition.
            this.increment();
            System.out.println("Value of Thread After Increment: " + Thread.currentThread().getName() + " is: " + this.getValue());

            this.decrement();
            System.out.println("Value of Thread After decrement: " + Thread.currentThread().getName() + " is: " + this.getValue());
        };
    }

    void increment() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        c++;
    }

    void decrement() {
        c--;
    }

    int getValue() {
        return c;
    }
}


