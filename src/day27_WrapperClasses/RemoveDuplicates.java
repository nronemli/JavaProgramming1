package day27_WrapperClasses;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveDuplicates {

    //remove duplicates from the given array, returns new array
    public static int[] removeDuplicates(int[] array) {
        int[] result = {};

        for (int eachElement : array) {
            if (!ArraysUtility.contains(result, eachElement)) {
                result = ArraysUtility.addElement(result, eachElement);
            }
        }
        return result;
    }

    //remove duplicates from the given array, returns new array
    public static double[] removeDuplicates(double[] array) {

        double[] result = {};
        for (double eachElement : array) {
            if (!ArraysUtility.contains(result, eachElement)) {
                result = ArraysUtility.addElement(result, eachElement);
            }
        }
        return result;

    }
    //remove duplicates from the given array, returns new array

    public static char[] removeDuplicates(char[] array) {

        char[] result = {};

        for (char eachElement : array) {
            if (!ArraysUtility.contains(result, eachElement)) {
                result = ArraysUtility.addElement(result, eachElement);

            }
        }
        return result;
    }
    //remove duplicates from the given array, returns new array

    public static String[] removeDuplicates(String[] array) {

        String[] result = {};

        for (String eachElement : array) {
            if (!ArraysUtility.contains(result, eachElement)) {
                result = ArraysUtility.addElement(result, eachElement);

            }
        }
        return result;
    }






    public static void main(String[] args) {

        int[] array = {1, 1, 2, 3, 4, 5, 5, 6, 6, 7};
        array = removeDuplicates(array);
        System.out.println(Arrays.toString(array));
    }


}
