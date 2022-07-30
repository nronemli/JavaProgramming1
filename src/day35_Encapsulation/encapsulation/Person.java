package day35_Encapsulation.encapsulation;

public class Person {

    //cant use them directly, only way to use them via getter and setter 
    private String name;
    private int age;

    //return data from the private data
    //returns the instance variable name
    public String getName() {
        return name;
    }

    //parameters have to same as the instance variable
    public void setName(String name) {
        this.name = name;
    }

    //getter : instance method //no parameters
    public int getAge() {
        return age;
    }

    //access modifier: public > instance
    //no return value :void.
    //additional information : int age(new age)
    public void setAge(int age) {
        if (age <= 0 || age > 150) {
            System.err.println("Invalid age: " + age);
            System.exit(0);
        }
        //set it to the instance to the new
        this.age = age;
    }


}
