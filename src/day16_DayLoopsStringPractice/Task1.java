package day16_DayLoopsStringPractice;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sumPositive  = 0;
        int sumNegative  = 0;
        for (int i = 0; i <5; i++) {
            System.out.println("Enter a number");
            int num = input.nextInt();
            if(num >=0){
                sumPositive++;
            } else {
                sumNegative++;
            }
        }
      System.out.println(sumPositive+" positive and " +sumNegative + "negative");
    }
}
/*
String adet olarak toplanicaksa sum+= num;
Int sayi olarak toplamak istiyorsak ++;
 */