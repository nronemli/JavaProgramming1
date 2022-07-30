package day15_ForLoop;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {

        int max = -2147483648; //smallest integer
        Scanner input = new Scanner(System.in);

        for(int i = 0; i<5;i++){

            System.out.println("Enter a number");
            int num = input.nextInt(); //1
            if(num >max){
                max= num;
            }
        }
        System.out.println("max " + max);
input.close();







    }





}
