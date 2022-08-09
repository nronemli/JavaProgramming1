package day39_Recap.cydeoTask.day40_FinalKeyword;

public class Animal {

    private String name;
    private final String breed;
    private final char gender;
    private final String color;
    private String size;
    private int age;

    public Animal(String name, String breed, char gender, String color, String size, int age) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.color = color;
        this.size = size;
        this.age = age;
    }


    //for variables that has final word cannot have setter
    //can generate 6 getters of the instance variables all can be read
    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public char getGender() {
        return gender;
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }

    public int getAge() {
        return age;
    }

    //can only generate 3 setters since 3 are declared finals
    public void setName(String name) {
        this.name = name;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //not all animals eat same thing therefore not final
    public void eat(){
        System.out.println(name + " is eating");
    }

    //same for all animals
    public final void drink(){
        System.out.println(name+ " is drinking water");
    }





}
