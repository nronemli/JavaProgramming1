package day35_Encapsulation.encapsulation;

import javax.print.DocFlavor;

public class Employee {

    private String name;
    private char gender;
    private int age;
    private double salary;

    /*calling setters in constructors:
      constructors allows you to set all those instance as soon as the object is created
      valid name, gender, age, salary is given >>> set
      set methods calling checks if the name , age ,gender is valid and sets them to the instance
    */
    public Employee(String name, char gender, int age, double salary) {
        setName(name);
        setGender(gender);
        setAge(age);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            return;
        }
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (!(gender == 'M' || gender == 'F')) {
            System.out.println("Wrong gender");
            System.exit(1);
            return;
        }
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 16 || age > 90) {
            return;
        }
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary <= 0) {
            return;
        }
        this.salary = salary;
    }


    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
