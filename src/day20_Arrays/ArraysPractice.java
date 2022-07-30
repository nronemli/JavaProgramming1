package day20_Arrays;

import java.util.Arrays;

public class ArraysPractice {

    public static void main(String[] args) {


        int[] num = {10, 20, 50, 70}; //size is 4

        System.out.println(Arrays.toString(num));

        System.out.println("------------------------------------");

        int[] scores = new int[5]; //now holds 0,0,0,0,0 default value is given

        System.out.println(Arrays.toString(scores));

        scores[1] = 85;
        scores[scores.length - 1] = 95;  //last element
        scores[3] = 75;
        scores[0] = 65;
        scores[2] = 55;

        System.out.println(Arrays.toString(scores));

        System.out.println("-------------------------------");

        String[] month = {"January", "February", "March", "April", "May", "June", "July", "August"
                , "September", "October", "November", "December"}; //0-11 (length-1);

        // System.out.println(month[0]); //to print index no 0, January.


        for (int i = 0; i < month.length; i++) {//i represents index numbers of array from 0
            System.out.println(month[i]); //Jan
        }

        System.out.println("-----------------------");

        for (int i = month.length - 1; i >= 0; i--) {
            System.out.println(month[i]);
        }

        System.out.println("--------------");


    }


}
