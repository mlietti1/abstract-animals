package org.lessons.java;

public class Main {
    public static void main(String[] args) {

        Animal[] animals = {new Dog("Snoopy"), new Sparrow("Tweety"), new Eagle("Falco"), new Dolphin("Flipper"), new Duck("Donald")};

        for (Animal animal:
             animals) {
            System.out.println("Hello! " + "My name is " + animal.getName());
            animal.speak();
            animal.eat();
            animal.sleep();
            if(animal instanceof Swimmer){
                ((Swimmer) animal).swim();
            }
            if(animal instanceof Flier){
                ((Flier) animal).fly();
            }
            System.out.println();
        }


    }
    public static void makeFly(Flier flier){
        flier.fly();
    }

    public static void makeSwim(Swimmer swimmer){
        swimmer.swim();
    }
}
