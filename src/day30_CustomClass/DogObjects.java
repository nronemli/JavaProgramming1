package day30_CustomClass;

import java.util.ArrayList;

public class DogObjects {

    public static void main(String[] args) {

        //class name  object name = keyword  constructor
        Dog dog1 = new Dog();
        dog1.name = "Lucy";
        dog1.breed = "Husky";
        dog1.age = 3;
        dog1.gender = 'F';
        dog1.size = "Small";
        dog1.colour = "White";

        System.out.println(dog1);

        //class name object name = keyword constructor
        Dog dog2 = new Dog();
        dog2.name = "Panda";
        dog2.breed = "Husky";
        dog2.age = 5;
        dog2.gender = 'M';
        dog2.size = "Large";
        dog2.colour = "Black";

        System.out.println(dog2);

        //class name, object name, keyword, constructor
        Dog dog3 = new Dog();

        dog3.setInfo("Jack", "Medium", "German Sheppard",
                "Brown", 3, 'M');

        System.out.println(dog3);

        dog1.eat();
        dog2.bark();
        dog3.eat();

        Dog dog4 = new Dog();
        dog4.setInfo("Bullet", "Extra Large", "Labrador",
                "Yellow", 3, 'M');

        Dog dog5 = new Dog();
        dog5.setInfo("Sully", "Large", "Pit-Bull",
                "Black", 6, 'M');

        Dog[] dogs= {dog1,dog2,dog3,dog4,dog5};

        ArrayList<Dog> femaleDogs=new ArrayList<>();
        ArrayList<Dog> maleDogs= new ArrayList<>();





    }


}
