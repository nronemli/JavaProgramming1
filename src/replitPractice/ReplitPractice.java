package replitPractice;

import java.util.Scanner;

public class ReplitPractice {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        String word = scan.next();

        int count = 0;

        for (int i = 0; i < word.length()-3; i++) {
          String result= word.substring(i,i+4);
          if(result.equalsIgnoreCase("Java")){
              count++;
          }



        }

        System.out.println(count);




    }
}
