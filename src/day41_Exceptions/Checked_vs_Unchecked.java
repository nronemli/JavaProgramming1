package day41_Exceptions;

import java.io.FileInputStream;

public class Checked_vs_Unchecked {

    public static void main(String[] args) {

        //unchecked exception
        //occurred during the runtime
        //is a relationship with runtime exception
        //parent class of all unchecked exception>>> runtime exception
        //unchecked requires analysing
        int a = 10;
        int b = 0;

        //unchecked exception: arithmetic
        // System.out.println(a / b);
        char[] chars = {'A', 'B', 'C'};
        //                0    1    2
        //cannot get the 99 th element since we dont have it,compile error in runtime
        //array index out of bounds exception
        // System.out.println(chars[99]);

        //checked Exception

        System.out.println("Hello");

        //   Thread.sleep(3000);
        System.out.println("Cydeo");

       // FileInputStream file = new FileInputStream("path of the file");






    }


}
