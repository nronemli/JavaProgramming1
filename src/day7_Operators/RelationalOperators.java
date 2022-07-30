package day7_Operators;

public class RelationalOperators {

    public static void main(String[] args) {
        //> , >= , <, <=

        boolean result1 = 20 > 40; //if 20 is greater than 40
        System.out.println(result1); //false

        boolean result2 =  300 >= 150; //300 greater or equal to 150
        System.out.println("result2 = " + result2);

        boolean result3 = 20 < 40;
        System.out.println(result3);

        boolean result4= 100 >=100;
        System.out.println("result4 = " + result4);
        
        boolean result5= 100 <=50;
        System.out.println("result5 = " + result5);

        //credit score of 720 to apply

        int score = 745;
        boolean isEligibleLoan = score >= 720;
        System.out.println("The customer is " + isEligibleLoan);

        //four of the boolean operators you can only use for numbers
        //these are >,  >=, < , <=

        //equal and not equal can be used for string as well
        // == !=
        int studentScore = 59;
        boolean hasFailed = studentScore <= 59;
        System.out.println("hasFailed = " + hasFailed);

        int x= 200;
        int y= 300;

        boolean equal = x==y;
        System.out.println (equal);

        boolean equal1= "java" == "java";
        System.out.println("Result 10: " +equal1);


    }


}
