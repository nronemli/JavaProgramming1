package day25_MethodOverloading;

import java.util.Arrays;

public class MethodOverloading {

    public static int sumOfNumbers(int num1, int num2) {
        return num1 + num2;
    }

    public static int sumOfNumbers(int num1, int num2, int num3) {
        return num1 + num2+num3;
    }

    public static int sumOfNumbers(int num1, int num2,int num3,int num4) {
        return num1 + num2+num3+num4;
    }

    public static double sumOfNumbers(double num1,double num2){
        return num1+num2;
    }

    public static double sumOfNumbers(double num1,double num2,double num3){
        return num1+num2+num3;
    }

    public static double sumOfNumbers(double num1,double num2,double num3,double num4){
        return sumOfNumbers(num1,num2,num3)+num4;
    }

    public static void main(String[] args) {
        int[] intArray= {1,2,3,4,5,-1};
        Arrays.sort(intArray);

        double[] doubleArray={10.5,11.4,5.5,4.5};
        Arrays.sort(doubleArray);

        char[] charArray={'e','f','g','h'};
        Arrays.sort(charArray);

        int sum1= sumOfNumbers(3,4);
        System.out.println(sum1);

        double sum2= sumOfNumbers(1.4,1.6);
        System.out.println(sum2);

    }
    }

