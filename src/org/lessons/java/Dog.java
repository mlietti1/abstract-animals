package org.lessons.java;

public class Dog extends Animal{

    private final String call;

    private final String diet;

    public Dog() {
        this.call = "Woof";
        this.diet = "Omnivorous";
    }

    @Override
    public void speak() {
        System.out.println(call);
    }

    @Override
    public void eat() {
        System.out.println(diet);
    }
}
