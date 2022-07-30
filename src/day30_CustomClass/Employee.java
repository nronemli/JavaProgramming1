package day30_CustomClass;

public class Employee {
    public String name;
    public char gender;
    public String jobTitle;
    public int ID;
    public double salary;
    public boolean isFullTime;

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", ID=" + ID +
                ", salary=" + salary +
                ", isFullTime=" + isFullTime +
                '}';
    }

    public void setInfo(String name, char gender, String jobTitle, int ID, double salary, boolean isFullTime) {
        this.name = name;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.ID=ID;
        this.salary = salary;
        this.isFullTime = isFullTime;
    }

    public void work(){
        System.out.println(jobTitle+ " " +name+ "is working");
    }





}


