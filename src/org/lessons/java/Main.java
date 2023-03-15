package org.lessons.java;

public class Main {
    public static void main(String[] args) {

        Dog snoopy = new Dog("Snoopy");

        System.out.println("Hello! " + "My name is " + snoopy.getName());
        snoopy.speak();
        snoopy.eat();
        snoopy.sleep();
        System.out.println();

        Sparrow tweety = new Sparrow("Tweety");

        System.out.println("Hello! " + "My name is " + tweety.getName());
        tweety.speak();
        tweety.eat();
        tweety.sleep();
        System.out.println();

        Eagle falco = new Eagle("Falco");

        System.out.println("Hello! " + "My name is " + falco.getName());
        falco.speak();
        falco.eat();
        falco.sleep();
        System.out.println();

        Dolphin flipper = new Dolphin("Flipper");

        System.out.println("Hello! " + "My name is " + flipper.getName());
        flipper.speak();
        flipper.eat();
        flipper.sleep();
        System.out.println();


    }
    public static void makeFly(Flier flyer){
        flyer.fly();
    }

    public static void makeSwim(Swimmer swimmer){
        swimmer.swim();
    }
}
