package day44_Abstraction.AnimalTask;

import day44_Abstraction.AnimalTask.Animal;

public final class Eagle extends Animal implements WildAnimal,Flyable{

    public Eagle(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats fish");
    }

    @Override
    public void hunt() {
        System.out.println(getName()+ " loves to hunt salmon");
    }

    @Override
    public void fly() {
        System.out.println(getName()+ " can fly 50/km h.");
    }
}
