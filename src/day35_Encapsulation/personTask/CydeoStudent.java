package day35_Encapsulation.personTask;

import java.security.PublicKey;

public class CydeoStudent {

    public String name;
    public char gender;
    public int age, batchNumber, groupNumber;
    public static String schoolName;
    public String fieldOfStudy;
    public static String programmingLanguage;
    public static String secretCode;


    static {
        schoolName = "CYDEO";
        programmingLanguage = "Java";
        secretCode = "Wooden spoon";
    }

    public CydeoStudent(String name, char gender, int age, int batchNumber, int groupNumber, String fieldOfStudy) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.fieldOfStudy = fieldOfStudy;
    }


    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", school=" + schoolName +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                '}';
    }

    public static void printSchoolName() {
        System.out.println(schoolName);
    }

    public static void printProgrammingLanguage() {
        System.out.println(programmingLanguage);
    }

    public static void printSecretCode() {
        System.out.println("the secret code is: " + secretCode);
    }







}

