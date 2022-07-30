package day09_IfElseStatements;

public class Calculator {
    public static void main(String[] args) {

        double n1 = 20.5;
        double n2 = 10.5;

        char operator = '+';

        double result = 0;

        if (operator == '+'){
            result = n1 + n2;
        } else if (operator == '-') {
            result = n1 - n2;
        } else if (operator == '*') {
            result = n1 * n2;
        } else if (operator == '/') {
            result= n1 / n2;
        } else {
            System.out.println("invalid operator");
        }
        System.out.println(result);
    }
}
