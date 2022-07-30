package day13_StringClass;

import java.util.Scanner;

public class PracticeTasks {

    public static void main(String[] args) {

        //System.out.println("PRACTICE TASK 1/DAY 13");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = input.nextLine();
        char firstChar = sentence.charAt(0);
        char lastChar = sentence.charAt(sentence.length() - 1);
        System.out.println("First character: " + firstChar + " Last character: " + lastChar);

        System.out.println("____________________________________________");

        //Task 2
        System.out.println("Enter two words: ");

        String word1 = input.next();
        String word2 = input.next();

        int word1Length = word1.length();
        int word2Length = word2.length();

        if (word1Length > word2Length) {
            System.out.println(word1);
        } else {
            System.out.println(word2);
        }

        System.out.println("_-------------------------------");

        //TASK3
        input.nextLine();
        System.out.println("Please enter a word");
        String word = input.nextLine();

       // char fChar = word.charAt(0);
   //     char lChar = word.charAt(word.length()-1);

       // if(fChar==lastChar){
     //       System.out.println("same");
       // }else {
            System.out.println("Not same ");
       // }


        System.out.println("________________________________");
        //TASK4

        System.out.println("Please enter first name:");
        String firstName = input.next();
        System.out.println("Please enter last name:");
        String lastName = input.next();

        char f = firstName.charAt(0); //index no starts from 0, this will give first letter
        char l = lastName.charAt(0);

        //adding a "" can help to concatinate char
        String result = f + "." + l;

        System.out.println(result);



        input.close();



    }


}
