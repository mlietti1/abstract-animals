package org.lessons.java;

public class Duck extends Animal implements Flier, Swimmer{

    private final String sound;

    private final String food;

    public Duck(String name) {
        super(name);
        this.sound = "Quack";
        this.food = "bread";
    }

    @Override
    public String toString() {
        return "Duck{" +
                "sound='" + sound + '\'' +
                ", food='" + food + '\'' +
                '}';
    }

    @Override
    public void speak() {
        System.out.println(sound);
    }

    @Override
    public void eat() {
        System.out.println("I'm eating "+ food);
    }

    @Override
    public void fly() {
        System.out.println("My name is " + getName() + ". " + sound + "!" + " I'm flying!");
    }

    @Override
    public void swim() {
        System.out.println("My name is " + getName() + ". " + sound + "!" + " I'm swimming!");
    }
}
