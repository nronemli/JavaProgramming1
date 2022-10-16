package day21_ForEachLoop;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};

        int i = 0;
        for (int eachArr1 : arr1) {
            for (int eachArr2 : arr2) {
                if (eachArr1 == eachArr2) {
                    System.out.print(eachArr1 + ",");
                }
            }
        }
    }
}
