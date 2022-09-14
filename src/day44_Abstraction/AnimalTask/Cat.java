package day44_Abstraction.AnimalTask;

import day44_Abstraction.AnimalTask.Animal;

public final class Cat extends Animal {

    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color); //call parent constructor
    }

    @Override
    public void eat() {
        System.out.println(getName() +" is eating cat food");
    }

    public void meow(){
        System.out.println(getName() +" is meowing");
    }





}
