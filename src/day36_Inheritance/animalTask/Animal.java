package day36_Inheritance.animalTask;


//super class :PARENT CLASS
public class Animal {
    //instance variables that apply to other classes, dog ,cat ,fish etc..

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

    public void setInfo(String name, String breed, char gender, String size, int age, String color) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.size = size;
        this.age = age;
        this.color = color;
    }
}



//name, breed, gender, size, age, color
//eat (), drink() , move(), sleep(), to string(), setInfo()

//Dog extends Animal :  bark()

//Cat extends Animal : scratch()

//Tiger extends Animal : roar()