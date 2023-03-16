package org.lessons.java;

public class Eagle extends Animal implements Flier{

    private final String sound;

    private final String food;

    public Eagle(String name) {
        super(name);
        this.sound = "Screech";
        this.food = "meat";
    }

    @Override
    public String toString() {
        return "Eagle{" + super.toString() + '\'' +
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
    public void fly() {
        System.out.println("My name is " + getName() + ". " + sound + "!" + " I'm flying!");
    }
}
