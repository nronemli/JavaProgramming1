package day36_Inheritance;

public class Student {

    private String name;
    private int age;
    private char gender, grade;
    private String schoolName;

    public Student(String name, int age, char gender, char grade, String schoolName) {
        setName(name);
        setAge(age);
        setGender(gender);
        setGrade(grade);
        setSchoolName(schoolName);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public char getGrade() {
        return grade;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if(age<=5 && age>=60){
            System.err.println("Invalid age" +age);
            System.exit(1);
        }
        this.age = age;
    }

    public void setGender(char gender) {
        if(!(gender == 'M' || gender=='F')){
            System.err.println("Invalid gender" +gender);
            System.exit(1);
        }
        this.gender = gender;
    }

    public void setGrade(char grade) {
        if(!(grade=='A' || grade=='B' || grade=='C')) {
            System.err.println("Invalid grade" + gender);
            System.exit(1);
            //return : quit function
            //instance variable age will not be set
        }
        this.gender = gender;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void study(){
        System.out.println(name+ "is studying");
    }

    //to print the objects of the class :to string method
    //static : COMMON VALUE FOR ALL OBJECTS
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", grade=" + grade +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }







}



/*
warmup tasks:
	1. Create a class named Student:
			private variables:
				name, age, gender, grade, schoolName

			Encapsulate all the fileds (at least encapsulate two fields manually)
					requirments:
						1. age should not be set less than 5 or greater than 90
						2. gender should not be set to any chanarcter other than: 'M' and 'F'
						3. grade should not be set to any chanacters other than: 'A', 'B', 'C', 'D', and 'F'

			Add a constructor that can set all teh fields when the object is created
						(requirments of fileds in the above must be applied)


			Methods:
				study()
				toString()

 */