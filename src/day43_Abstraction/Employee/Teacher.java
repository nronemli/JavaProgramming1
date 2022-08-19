package day43_Abstraction.Employee;

public final class Teacher extends Employee{

    public Teacher(String name, int age, char gender, int ID, String jobTitle, double salary) {
        super(name, age, gender, ID, jobTitle, salary);
    }

    @Override
    public void work() {

    }

    @Override
    public void sleep() {

    }
}
