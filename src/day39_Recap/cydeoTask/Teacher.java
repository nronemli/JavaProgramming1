package day39_Recap.cydeoTask;

public class Teacher extends Employee{

    public Teacher(String name, int age, char gender, int employeeId, double salary) {
        super(name, age, gender, employeeId, "Teacher", salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+ "is teaching");
    }





}



/*
 5. Create a sub class of Employee named Teacher

            Override the work method
 */
