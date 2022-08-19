package day43_Abstraction.Employee;

public final class Developer extends Employee{

    public Developer(String name, int age, char gender, int ID, String jobTitle, double salary) {
        super(name, age, gender, ID, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+ " coding in java");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " likes to sleep 6 hours");
    }

    public void unitTesting(){
        System.out.println(getName()+ " is unit testing");
    }


}
