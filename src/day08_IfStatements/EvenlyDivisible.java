package day08_IfStatements;

public class EvenlyDivisible {
    public static void main(String[] args) {

        int num = 65;

        boolean isDivisibleBy2 = num % 2 == 0;
        boolean isDivisibleBy3 = num % 3 == 0;
        boolean isDivisbleBy5 = num % 5 == 0;

        System.out.println("isDivisibleBy2 = " + isDivisibleBy2);
        System.out.println("isDivisibleBy3 = " + isDivisibleBy3);
        System.out.println("isDivisbleBy5 = " + isDivisbleBy5);


    }


}
