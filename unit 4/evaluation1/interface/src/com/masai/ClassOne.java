package com.masai;

public abstract class ClassOne implements InterfaceThree{
    @Override
    public void methodThree(){
        System.out.println("Inside methodThree of ClassOne");
    }
}


class ClassTwo extends ClassOne {

    @Override
    public void methodOne(){
        System.out.println("Inside methodOne of ClassTwo");
    }

    @Override
    public void methodtwo() {
        System.out.println("Inside methodTwo of ClassTwo");
    }

    @Override
    public String toString() {
        return "This is ClassTwo object";
    }
}