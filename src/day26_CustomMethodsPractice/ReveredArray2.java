package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

public class ReveredArray2 {

    public static int[] reverseArray(int[] array) {

        int[] result = {};
        for (int i = array.length - 1; i >= 0; i--) {
            result = ArraysUtility.addElement(result, array[i]);
        }
        return result;
    }
}



