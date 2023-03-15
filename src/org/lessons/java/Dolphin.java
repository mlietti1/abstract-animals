package org.lessons.java;

public class Dolphin extends Animal implements Swimmer{

    private final String sound;

    private final String food;


    public Dolphin(String name) {
        super(name);
        this.sound = "Eek";
        this.food = "fish";
    }

    @Override
    public String toString() {
        return "Dolphin{" + super.toString() + '\'' +
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
        System.out.println("I'm eating "+ food);    }

    @Override
    public void swim() {
        System.out.println("My name is " + getName() + ", " + sound + "!" + " I'm swimming!");
    }
}
