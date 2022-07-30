package day25_MethodOverloading;

public class SumOfNumbers {
/*
    1. create a method that can find the sum of two numbers
    method name: sumOf2Numbers*/
    public static int sumOf2Numbers(int num1, int num2) {
        return num1 + num2;
    }
/*2. create a method that can find the sum of three numbers
	                    method name: sumOf3Numbers*/
    public static int sumOf3Numbers(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
/* 3. create a method that can find the sum of four numbers
	                    method name: sumOf4Numbers*/
    public static int sumOf4Numbers(int num1, int num2, int num3, int num4) {
        return num1 + num2 + num3 + num4;
    }



    public static void main(String[] args) {
        int sum = sumOf2Numbers(10, 20);
        System.out.println("sum = " + sum);

        int sum3 = sumOf3Numbers(10,20,30);
        System.out.println("sum3 = " + sum3);

        int sum4 = sumOf4Numbers(10,20,30,40);
        System.out.println("sum4 = " + sum4);

    }


}
