package day11_Switch_Scanner;

public class SalaryTax {
    public static void main(String[] args) {

        double salary = 75000;
        boolean isMarried = true;
        double taxRate = 0;

        if (salary >= 13000) {
            taxRate = 0.35;
        } else if (salary >= 100000) {
            taxRate = 0.30;
        } else if (salary >= 80000) {
            taxRate = 0.25;
        } else {
            taxRate = 0.20;
        }

        if (isMarried) {
            taxRate -= 0.05; //subtraction %5 of original tax rate
        }

        double salaryAfterTax = salary - (salary * taxRate);
        System.out.println(salaryAfterTax);
    }
}
