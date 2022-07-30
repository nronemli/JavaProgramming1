package day36_Inheritance.scrumTask;

public class Developer extends Employee{

    public Developer(String name, int age, char gender, int id, String jobTitle, double salary, String companyName) {
        super(name, age, gender, id, jobTitle, salary, companyName);
    }

    public void fixingBugs(){
        System.out.println(jobTitle+ " "+ name+ " is fixing bugs");
    }

}
