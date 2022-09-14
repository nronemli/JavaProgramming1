package day41_Exceptions;

import jdk.swing.interop.SwingInterOpUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCathBlocks {

    public static void main(String[] args) {
        System.out.println("Test1 started");
        try {
            System.out.println(9 / 0);    //Jumped to catch from here
            System.out.println("Try block ");
        } catch (ArithmeticException e) {
            System.out.println("Catch block");
            System.out.println("Arithmetic Exception was occured");
        }
        System.out.println("Test1 completed");
        System.out.println("____________________________________");

        int[] numbers = {1, 2, 3, 4, 5, 6};

        System.out.println("Test 2 started");
        try {
            System.out.println(numbers[10]);

        } catch (RuntimeException e) { //catch block
            //full details of exception by calling print stack trace method
            //this is the preferred method
            e.printStackTrace();
            //System.out.println(e.getMessage()); //prints brief description
        }

        System.out.println("____________________________________");
        System.out.println("Test 3 started");

        //unchecked exception
        //System.out.println("Cydeo".substring(2,0));

        try {
            System.out.println("Cydeo".substring(2, 0));
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        System.out.println("____________________________________");
        System.out.println("Hello");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Cydeo");
        System.out.println("____________________________________");
        try {
            FileInputStream file = new FileInputStream("File path");
        } catch (FileNotFoundException e) {
            e.printStackTrace(); //prints a stack trace (full details ) of exception
        }
    }
}
