package day44_Abstraction.AnimalTask;

import day44_Abstraction.AnimalTask.Animal;

public final class Dog extends Animal implements Playable{

    public Dog(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color); //call parent class constructor
    }

    public void bark(){
        System.out.println(getName() + " is barking");
    }

    @Override
    public void eat() {
        System.out.println(getName()+ " eats dog food");
    }

    @Override
    public void play() {
        System.out.println(getName() + " likes to play games");
    }

}
