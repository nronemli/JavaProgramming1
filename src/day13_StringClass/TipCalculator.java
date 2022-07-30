package day13_StringClass;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Split or No split (Yes or No)?");
        String yesNo = input.next();
        System.out.println("Enter the number of people");
        int noOfPeople = input.nextInt();
        System.out.println("Enter the check amount:");
        double amount = input.nextDouble();
        System.out.println("How was the service quality? (Excellent/Great/Good/Fair/Poor)");
        String serviceQuality = input.next();

        double totalPerPerson = amount / noOfPeople;

        double tipCalculator = 0;

            if (serviceQuality.equals("Excellent")) {
                tipCalculator = amount * 0.25;
            } else if (serviceQuality.equals("Great")){
                tipCalculator = amount * 0.20;
            } else if (serviceQuality.equals("Good")){
                tipCalculator = amount * 0.15;
            } else if (serviceQuality.equals("Fair")) {
                tipCalculator = amount * 0.10;
            } else if(serviceQuality.equals("Poor")){
                tipCalculator = amount * 0.5;
            }

        double totalTipPp= tipCalculator /noOfPeople;

        System.out.println("Number of people entered:" + yesNo);
        System.out.println("Total to pay: " + amount);
        System.out.println("Total tip: " + tipCalculator);
        System.out.println("Total per person:" + totalPerPerson);
        System.out.println("Tip per person:" + totalTipPp);
        input.close();
    }

}

