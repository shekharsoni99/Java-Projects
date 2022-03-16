package com.masai;

public class Main {

    public static void main(String[] args) {

        InterfaceThree infThree = new ClassTwo();
        System.out.println(infThree);
        infThree.methodOne();
        infThree.methodtwo();
        infThree.methodThree();

        InterfaceOne infOne = new ClassTwo();
        infOne.methodOne();

        ClassTwo dwnCast = (ClassTwo) infOne;
        dwnCast.methodtwo();
        dwnCast.methodThree();
    }
}
