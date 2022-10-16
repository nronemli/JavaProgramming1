package day21_ForEachLoop;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {

        int[] num = {1, 4, 6, 8, 3, 10}; //i
        int reversed[] = new int[num.length]; //j

        for (int i = num.length - 1, j = 0; i >= 0; i--, j++) {
            reversed[j] = num[i];
        }
        System.out.println(Arrays.toString(reversed));

    }
}
