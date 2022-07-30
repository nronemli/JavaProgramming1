package day30_CustomClass;

public class Dog {

    //instance variables
    public String name;
    public String size;
    public String breed;
    public String colour;
    public int age;
    public char gender;

    public void setInfo(String dogName, String dogSize, String dogBreed, String dogColour, int dogAge, char dogGender) {
        name = dogName;
        size = dogSize;
        breed = dogBreed;
        colour = dogColour;
        age = dogAge;
        gender= dogGender;
    }


    //void: no return type
    public void eat() {
        System.out.println(name + " is eating");
    }

    //instance method
    public void bark() {
        System.out.println(name + " is barking");
    }

    //toString method
    //right click, generate, tick all
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", breed='" + breed + '\'' +
                ", colour='" + colour + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }


}

/*
Attributes:
    name, size, age, gender, breed, colour

Actions:
    eat(), play(), bark()
 */