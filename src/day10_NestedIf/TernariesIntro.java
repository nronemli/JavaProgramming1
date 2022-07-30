package day10_NestedIf;

public class TernariesIntro {
    public static void main(String[] args) {

        int n = 100;

        if (n % 2 == 0) { //can be divided to 2 it will be even otherwise off
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
        System.out.println("______________________________");
        System.out.println("Ternary");
        String result1 = (n % 2 == 0) ? "Even" : "Odd";
        System.out.println(result1);
        System.out.println("_______________________________");


        int age = 23;
        String eligible = (age >= 21) ? "Eligible" : "Not eligible";
        System.out.println("Eligible");

        System.out.println("_______________________________");

        int num = 100;

        String result2 = (num > 0) ? "Positive" : (num < 0) ? "Negative" : "Zero";

        System.out.println(result2);

        System.out.println("_______________________________");


    }


}
