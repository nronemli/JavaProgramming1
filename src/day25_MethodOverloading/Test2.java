package day25_MethodOverloading;

import utilities.ArraysUtility;

import java.util.Arrays;

public class Test2 {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};

        ArraysUtility.printEachElement(arr1);

        System.out.println("--------------------------------");

        double[] arr2 = {1.5, 2.5, 3.5, 4.5};

        ArraysUtility.printEachElement(arr2);

        System.out.println("--------------------------------");

        char[] arr3 = {'A', 'B', 'C', 'D'};

        ArraysUtility.printEachElement(arr3);

        System.out.println("--------------------------------");

        String[] names = {"David", "Elvira", "Ali", "Igor"};

        ArraysUtility.printEachElement(names);
        System.out.println("--------------------------------");

        int [] number = {1,3,4,5,6,7,8};
        int max1= ArraysUtility.maxNum(number);
        System.out.println("max1 = " + max1);

        double[] number1= {1.2,4.56,7.68,9,0};
        double max2= ArraysUtility.maxNum(number1);
        System.out.println("max2 = " + max2);

        System.out.println("-------------task1---test----------------");

        int []array1= {1,2,3};
        int []array2={4,5,6};

        int[]merge= Merge.merge(array1,array2);
        System.out.println(Arrays.toString(merge));

        System.out.println("-------------task-------------------");


    }




}
