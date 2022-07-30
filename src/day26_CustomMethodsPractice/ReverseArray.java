package day26_CustomMethodsPractice;

import java.util.Arrays;

public class ReverseArray {

    public static int[] reverseArray(int[] array) {

        int[] reversedArray = new int[array.length];

        int j = 0; //index of reversed array
        for (int i = array.length - 1; i >= 0; i--) {
            reversedArray[j] = array[i]; //assign index of array to reversed array index
            j++; //reversed array must increase each time
        }
        return reversedArray;
    }


    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};
        int[] result = reverseArray(array);
        System.out.println(Arrays.toString(result));

    }


}
