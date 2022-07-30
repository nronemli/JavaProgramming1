package day32_Constructor;

/*
Constructor Call:
		1. Constructor can not be called by its name ( this() need to be used )
		2. Only a constructor can call another constructor
		3. Constructor call MUST be at the first step
		4. One constructor can not call more than one constructor
		5. Constructor can not call or conatin itself
 */
public class Employee {

    public String name;
    public char gender;
    public String jobTitle;
    public double salary;

    //Constructor:
    public Employee(String name) {
        this.name = name;

    }
/*this: refers to the instances
	this. : to call instance variables & instance methods
	this() : used for calling the constructors
*/
    public Employee(String name, char gender) {
        //call constructor calls
        this(name);
        this.gender = gender;
    }


    public Employee(String name, char gender, String jobTitle) {
        this(name, gender);
        this.jobTitle = jobTitle;
    }


    public Employee(String name, char gender, String jobTitle, double salary) {
        this(name, gender, jobTitle);
        this.salary = salary;
    }


    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
