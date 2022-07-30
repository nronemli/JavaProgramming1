package day37_Inheritance.animalTask;

public class Animal {

    public String name, breed;
    public char gender;
    public String size;
    public int age;
    public String color;

    public void eat(){
        System.out.println(name+ " is eating");
    }

    public void drink(){
        System.out.println(name+ " is eating");
    }

    public void move(){
        System.out.println(name+" is moving");
    }

    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    //constructor: for creating object
    public Animal(String name, String breed, char gender, String size, int age, String color) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.size = size;
        this.age = age;
        this.color = color;
    }





}








