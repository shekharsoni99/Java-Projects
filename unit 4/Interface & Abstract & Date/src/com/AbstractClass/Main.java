package com.masai;

public class Main {

    public static void main(String[] args) {

        Animal[] animals = new Animal[3];
        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Tiger();

        for (Animal items:animals) {
            items.makeNoise();
            items.eat();
            items.walk();
            System.out.println("--------------------------------");
        }
    }
}

abstract class Animal{
    public abstract void makeNoise();

    public void eat() {
        System.out.println("Animal is eating");
    }

    public void walk() {
        System.out.println("Animal is walking");
    }
}

class Dog extends Animal {
    @Override
    public void makeNoise() {
        System.out.println("Barking...");
    }
}

class Cat extends Animal {
    @Override
    public void makeNoise () {
        System.out.println("Meow...");
    }
}

class Tiger extends Animal {
    @Override
    public void makeNoise() {
        System.out.println("Roaring...");
    }
}
