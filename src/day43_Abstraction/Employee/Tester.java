package day43_Abstraction.Employee;

//final so that nobody inherits it
public final class Tester extends Employee {




    public Tester(String name, int age, char gender, int ID, String jobTitle, double salary) {
        super(name, age, gender, ID, jobTitle, salary);
    }

    public void bugReport(){
        System.out.println(getName()+ " is creating bug reports");
    }

    @Override
    public void work() {
        System.out.println(getName()+" is testing the application");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " sleeps 8 hours");
    }


}
