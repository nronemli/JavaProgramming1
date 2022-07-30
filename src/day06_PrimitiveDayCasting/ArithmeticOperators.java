package day06_PrimitiveDayCasting;

public class ArithmeticOperators {
    public static void main(String[] args) {

        System.out.println("12" + 1); //121 , concatenation
        System.out.println(10 + 20); //30 , Addition
        System.out.println(100 - 50); //50 ,Subtraction
        System.out.println(10 * 5); //50 , Multiplication

        System.out.println(100 / 3); //33
        System.out.println(10.0 / 4); //2.5
        System.out.println(10 / 4.0); //2.5
        System.out.println(10d / 4); //2.5


        int a = 100;
        double b = a / 6; //16.0
        System.out.println(b);

        double c = a / 6d; //16.66666
        System.out.println(c);

        /*
        +: Addition
        -: Subtraction
        *: Multiplication
        /: Division
        */


    }


}
