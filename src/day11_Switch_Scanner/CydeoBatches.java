package day11_Switch_Scanner;

import java.util.Scanner;

public class CydeoBatches {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your batch type: ");
        String batchName = input.next();
        String result = "";

        boolean batchType = batchName == "US Morning" || batchName == "US Evening" || batchName == "EU";

        if (batchType) {
            switch (batchName) {
                case "US Morning":
                    result = "Clas times are 10-5 EST. M, T, Th, F";
                    break;
                case "US Evening":
                    result = "Class times are 7-10 EST. M, T, W , TH, S, S ";
                    break;
                case "EU":
                    result = "Class times are 10-5 EST. M, T, W, Th, F. ";
                    break;
                default:
                    result = "Invalid Batch";
            }
            System.out.println(result);
        }
        input.close();
    }
}