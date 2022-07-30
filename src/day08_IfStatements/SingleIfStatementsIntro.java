package day08_IfStatements;

public class SingleIfStatementsIntro {

    public static void main(String[] args) {

        //single if = one possible outcome
        int number = 300;

        boolean evenNumber = number % 2 == 0;
        boolean oddNumber = !evenNumber;

        //it prints only if the condition is true
        if (evenNumber) {
            System.out.println(number + " :is even number ");
        }

        //not even will be printed if the number is odd, gets executed
        if (!evenNumber) {
            System.out.println(number + " is odd number ");

        }
        System.out.println("-------------------------------");
        int n = 200;
        //positive
        if (n > 0) { //if n is greater than 0
            System.out.println(n + " is positive");
        }

        //negative
        if (n < 0) { //if n is smaller than 0 its negative
            System.out.println(n + " is negative");

        }
        //zero
        if (n == 0) { //if n is equals to 0 than it gets executed
            System.out.println(n + "equals to zero");

        }






    }
}

