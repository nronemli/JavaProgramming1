package day21_ForEachLoop;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {


        int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] even = new int[numbers.length];
        int[] odd = new int[numbers.length];

        int i = 0;
        for (int each : numbers) {
            if (each % 2 == 0) {
                even[i] = numbers[i];
                i++;
            }
            if (each % 2 != 0) {
                odd[i] = numbers[i];
                i++;
            }
        }

        System.out.println("Even numbers in the array: ");
        System.out.println(Arrays.toString(even));
        System.out.println("Odd numbers in the array: ");
        System.out.println(Arrays.toString(odd));

    }


}
