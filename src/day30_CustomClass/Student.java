package day30_CustomClass;

import javax.swing.text.html.parser.TagElement;

public class Student {

    //instance variables: variables declared outside the method
    public String name;
    public char gender;
    public int age;
    public int ID;
    public char grade;

    //local variables: variables declared within the method:
    // local variable will be called : same name can be used
    //this. in java used for calling for instances
    public void setInfo(String name, char gender, int age, int ID, char grade) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.ID = ID;
        this.grade = grade;

    }

    //right click, generate, constructor, select all. change void and name
    /*
    public void setInfo(String name, char gender, int age, int ID, char grade) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.ID = ID;
        this.grade = grade;
    }
*/
    //to string method : right click - generate
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", ID=" + ID +
                ", grade=" + grade +
                '}';
    }

    public void code(){
        System.out.println(name+" is coding");
    }
    public void sleep(){
        System.out.println(name+" is sleeping");
    }



}

