package org.lessons.java;

public class Dog extends Animal implements Swimmer{

    private final String sound;

    private final String food;

    public Dog(String name) {
        super(name);
        this.sound = "Woof";
        this.food = "kibble";
    }

    @Override
    public String toString() {
        return "Dog{" + super.toString() + '\'' +
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
    public void swim() {
        System.out.println("My name is " + getName() + ". " + sound + "!" + " I'm swimming!");    }
}
