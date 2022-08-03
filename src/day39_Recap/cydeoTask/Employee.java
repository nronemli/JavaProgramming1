package day39_Recap.cydeoTask;

public class Employee extends Person {
    private int employeeId;
    private String jobTitle;
    private double salary;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        if (jobTitle.isBlank() || jobTitle.isEmpty()) {
            System.out.println("Job title cannot be empty");
            System.exit(1);
        }
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary <= 0) {
            System.out.println("Salary cannot be negative");
            System.exit(1);
        }
        this.salary = salary;
    }

    //child class calls parent class constructor
    //only a constructor can call a constructor
    public Employee(String name, int age, char gender, int employeeId, String jobTitle, double salary) {
        super(name, age, gender);
        setEmployeeId(employeeId);
        setJobTitle(jobTitle);
        setSalary(salary); //setter is a better choice than this. because it can check the
        // conditions before it sets the instance variables
    }

    @Override
    public String toString() {
        return "Employee{" + '\n'+
                "name='" + getName() + '\'' +
                ", age=" + getAge() + '\''+
                ", gender=" + getGender() + '\''+
                "employeeId=" + employeeId + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }


    //read the name only through the getter
    public void work(){
        System.out.println(getName()+ " is working");
    }
}



/*
 2. Create a sub class of Person named Employee:
            Extra variables:
                employeeId, jobTitle, salary

            Encapsulate all the fields

            Add a constructor to set all the fields

            Methods:
                work()
                toString()
 */
