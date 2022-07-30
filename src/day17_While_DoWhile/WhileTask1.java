package day17_While_DoWhile;

import java.util.Scanner;

public class WhileTask1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Will you marry me");
        String answer = input.next();

        if(answer=="yes"){
            System.out.println("Congradulations");
        }
        if(answer=="no"){
            System.out.println("Sorry");
        }
       // while()


        input.close();





    }





}
