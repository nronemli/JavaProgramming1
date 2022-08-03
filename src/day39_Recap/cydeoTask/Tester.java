package day39_Recap.cydeoTask;

public class Tester extends Employee{

    //child class calls parent class constructor
    //deleted the parameter of job title and added tester
    public Tester(String name, int age, char gender, int employeeId, double salary) {
        super(name, age, gender, employeeId,"Tester", salary);
    }

    @Override
    public void work() {
        System.out.println(getJobTitle()+" " + getName() + " is testing application");    }

    public void createTicket(){
        System.out.println(getJobTitle() + " " +getName() + " creates ticket ");
    }




}






/*
3. Create a sub class of Employee named Tester

            Override the work method

            Extra methods:
                createTicket()

 */