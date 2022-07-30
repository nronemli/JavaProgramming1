package day08_IfStatements;

public class LogicalOperators {

    public static void main(String[] args) {

        int age = 19;
        String citizen = "USA";

        //&& = both       , || either ;
        //LOGICAL AND 75% FALSE, 25% TRUE
        boolean isEligible = age >= 18 && citizen == "USA";
        //                  19>=18 && USA //TRUE

        System.out.println("isEligible = " + isEligible);

        System.out.println("__________________________________");

        String name2 = "Josh";
        int creditScore = 720;
        int age2 = 23;
        int income = 40000;
        //both condition has to match , credit score and age
        boolean isEligibleLoan = creditScore >= 700 && age2 >= 21 && income >= 40000;

        System.out.println(name2 + " is eligible for Loan = " + isEligibleLoan);

        System.out.println("____________________________________");

        //Logical ||OR operator
        String name3 = "Nur";
        int age3 = 21;
        char gender = 'F';

        boolean isEligible3 = age3 >= 18 && (gender == 'M' || gender == 'F');
        //                      21 >=18 && (F) /true
        //                      true && (false || true
        //                      true && true
        //                      true
        System.out.println("isEligible3 = " + isEligible3);

        System.out.println("________________________________");

        //Logical NOT ! operator returns the opposite

        boolean result4= true;
        System.out.println("result4 = " + result4);
        boolean result3 = !result4;
        System.out.println("result3 = " + result3);

        //



    }


}
