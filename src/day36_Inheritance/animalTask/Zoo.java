package day36_Inheritance.animalTask;

public class Zoo {


    public static void main(String[] args) {


        Dog dog = new Dog();
        dog.setInfo("Max", "Husky", 'M', "Small", 1, "White");

        dog.eat();
        dog.drink();
        dog.move();
        dog.bark();
        // dog.hunt();
        // dog.scratch();

        System.out.println(dog);

        Cat cat = new Cat();
        cat.setInfo("Tarcin","British",'M',"Large",4,"brown");

        cat.eat();
        cat.drink();
        cat.move();
        // cat.bark();
        //  cat.hunt();
        cat.scratch();
        System.out.println(cat);

        Tiger tiger = new Tiger();
        tiger.setInfo("Sher Khan", "Bengal", 'M', "small", 5, "Orange");

        tiger.eat();
        tiger.drink();
        tiger.move();

        tiger.roar();
        tiger.hunt();

        System.out.println(tiger);

        //  tiger.bark();








    }
}
