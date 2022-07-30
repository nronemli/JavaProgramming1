package day13_StringClass;

import java.util.Scanner;

public class CheckWords {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter three words: ");
        String word1 = input.next();
        String word2 = input.next();
        String word3 = input.next();

        if(word1.length() == word2.length() && word2.length() == word3.length()){
            System.out.println("All words are same length");
        } else if (!(word1.length() == word2.length() || word2.length() == word3.length())) {
            System.out.println("Not same nor different length");
        }else {
            System.out.println("All are different");
        }
        input.close();

        //     int l1 = word1.length();
      //   int l2= word2.length();
       // int l3= word3.length();

      //  if(word1.equals(word2) || (word2.equals(word3))){
        //    System.out.println("All words same length");
        //}//else if(){

        //}





        }


        // if(word1.length() == word2.length()==word3.length()){


    }


