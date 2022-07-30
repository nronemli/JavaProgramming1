package day7_Operators;

public class UnaryOperators {
    public static void main(String[] args) {

        int num1 = +25;  //dont have to declare positive number
        int num2 = -25; //must put - to indicate negative number

        System.out.println(num1 < 0);
        System.out.println(num2 < 0);

        System.out.println("-------------------------------");
        //pre increment/decrement

        int num3 = 1;
        int num4 = 5;
        ++num1; //pre-increment
        --num2; //pre-decrement

        System.out.println(num3);
        System.out.println(num4);

        System.out.println("_____________________________");

        int num5 = 50;
        System.out.println(++num5); //pre-increment
        int num6 = 60;
        System.out.println(num6--); //post increment it will print the value of the number first and then print
        // the increment in the next line
        //passes the current value first
        System.out.println(num6); //it will print 59, after it prints the actual number previous line

        System.out.println("-------------------------------------");

        int a = 10;
        System.out.println(a++); // 10 post increment
        System.out.println(++a); //12 pre increment
        System.out.println(a);  //12


    }


}
