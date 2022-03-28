package com.evaluation3.DeadLock;

public class Main {
    public static void main(String[] args) {
//        DeadLock in multithreading
//        Answer: Deadlock in multithreading means when two functions are waiting for each other's response forever.
//        Reason for deadlock is synchronization.
//        it takes infinite time.

//        example of deadlock:

        A a1 = new A();
        B b1 = new B();

        DeadlockThreadA ta = new DeadlockThreadA(a1, b1);
        DeadlockThreadB tb = new DeadlockThreadB(a1, b1);

        Thread thread1 = new Thread(ta);
        Thread thread2 = new Thread(tb);

        thread1.start();
        thread2.start();
    }
}

class A {
    public synchronized void method1(B b1) {

        System.out.println("Inside method 1");
        b1.fun2();
        System.out.println("End of method 1");
    }

    public synchronized void fun1() {
        System.out.println("Inside function 1 of method 1");
    }
}

class B {
    public synchronized void method2(A a1) {
        System.out.println("Inside method 2");
        a1.fun1();
        System.out.println("End of method 2");
    }

    public synchronized void fun2() {
        System.out.println("Inside function 2 of method 2");
    }
}

class DeadlockThreadA implements Runnable {

    A a1;
    B b1;

    public DeadlockThreadA(A a1, B b1) {
        this.a1 = a1;
        this.b1 = b1;
    }

    @Override
    public void run() {
        a1.method1(b1);
    }
}

class DeadlockThreadB implements Runnable {

    A a1;
    B b1;

    public DeadlockThreadB(A a1, B b1) {
        this.a1 = a1;
        this.b1 = b1;
    }

    @Override
    public void run() {
        b1.method2(a1);
    }
}

