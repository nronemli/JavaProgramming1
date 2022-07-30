package replitPractice;

import java.util.Scanner;

public class SecondsConvertor {
        public static void main(String[] args) {
            //YOUR CODE HERE:
        int hours;
        int minute;
        int seconds;

            Scanner input = new Scanner(System.in);
            System.out.println("Enter seconds: ");
            int inputSeconds= input.nextInt();

            int hoursR = inputSeconds/3600;
            int minuteR= hoursR * 60 ;

            System.out.println(hoursR);
            System.out.println(minuteR);





        }
    }








