package day27_WrapperClasses;

import java.util.Arrays;

public class ReplaceAll {

    //replace all matching old num with new number
    public static int[] replaceAll(int[] arr, int oldNum, int newNum) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == oldNum) {
                arr[i] = newNum; //store the new value in the array index
            }
        }
        return arr;
    }
    //replace all matching old num with new number
    public static double[] replaceAll(double[] arr, double oldNum, double newNum) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == oldNum) {
                arr[i] = newNum; //store the new value in the array index
            }
        }
        return arr;
    }
    //replace all matching old num with new number
    public static char[] replaceAll(char[] arr, char oldNum, char newNum) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == oldNum) {
                arr[i] = newNum; //store the new value in the array index
            }
        }
        return arr;
    }
    //replace all matching old num with new number
    public static String[] replaceAll(String[] arr, String oldNum, String newNum) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == oldNum) {
                arr[i] = newNum; //store the new value in the array index
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 5};
        array = replaceAll(array, 5, 50);
        System.out.println(Arrays.toString(array));
        array=replaceAll(array,50,500);
        System.out.println(Arrays.toString(array));

    }
}
