package day44_Abstraction.AnimalTask;

import day44_Abstraction.AnimalTask.Animal;

public final class Parrot extends Animal implements Playable,Flyable{
    public Parrot(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " likes to eat parrot food");
    }

    @Override
    public void play() {
        System.out.println(getName()+ " likes to play with feathers");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " can fly 20km/h");
    }
}
