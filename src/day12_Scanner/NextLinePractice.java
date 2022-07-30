package day12_Scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class NextLinePractice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);//Enter

        //if using nextLine method after 8 methods, clean scanner line 15 check
        System.out.println("Enter age: ");
        int age = input.nextInt(); //33

        input.nextLine();
        System.out.println("Enter full name: ");
        String name = input.nextLine();

        System.out.println("Enter your GPA: ");
        double gpa = input.nextDouble();

        System.out.println("age = " + age);
        System.out.println("name = " + name);
        System.out.println("gpa = " + gpa);

        input.close();
    }


}
