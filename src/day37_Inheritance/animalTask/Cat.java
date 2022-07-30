package day37_Inheritance.animalTask;

import day37_Inheritance.animalTask.Animal;

public class Cat extends Animal {

    public Cat(String name, String breed, char gender, String size, int age, String color) {
        super(name, breed, gender, size, age, color);
    }

    public void meow() {
        System.out.println(name + "is meowing");
    }

    public void scratch() {
        System.out.println(name + " scratches");
    }

}
