package day36_Inheritance.scrumTask;

import java.util.Collection;

public class Tester extends Employee{

    public Tester(String name, int age, char gender, int id, String jobTitle, double salary, String companyName) {
        super(name, age, gender, id, jobTitle, salary, companyName);
    }

    public void testing() {
        System.out.println(name + "is testing");
    }

    public void creatingTicket() {
        System.out.println(name + " is creating ticket");
    }

    public String toString() {
        return "Tester{" +
                "id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", companyName='" + companyName + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}


/*
3. Create a sub class of Employee named Tester:

			Add any extra variable or method that
			Tester object need to have
 */