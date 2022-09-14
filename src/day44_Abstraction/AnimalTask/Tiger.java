package day44_Abstraction.AnimalTask;

import day44_Abstraction.AnimalTask.Animal;

public final class Tiger extends Animal implements WildAnimal{
    public Tiger(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats snake");
    }

    @Override
    public void hunt() {
        System.out.println(getName()+ " loves to hunt deer");
    }
}
