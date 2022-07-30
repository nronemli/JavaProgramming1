package day13_StringClass;


import java.util.Scanner;

public class Initials {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Please enter first name:");
        String firstName = input.next();

        System.out.println("Please enter last name:");
        String lastName = input.next();
        //returns the character at the given index
        char f = firstName.charAt(0); //index no starts from 0, this will give first letter
        char l = lastName.charAt(0);

        //adding a "" can help to concatinate char
        String result = f + " " + l;

        System.out.println(result);
      //  System.out.println(f+ " " +l);
        input.close();
    }
}
