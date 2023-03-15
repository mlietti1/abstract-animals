package org.lessons.java;

public class Sparrow extends Animal implements Flier {

    private final String sound;

    private final String food;

    public Sparrow(String name) {
        super(name);
        this.sound = "Chirp";
        this.food = "seeds";
    }

    @Override
    public String toString() {
        return "Sparrow{" + super.toString() + '\'' +
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
        System.out.println("My name is " + getName() + ", " + sound + "!" + " I'm flying!");
    }
}
