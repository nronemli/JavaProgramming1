package day22_MultiDimentionalArray;

import java.util.Arrays;

public class ForEachLoop {
    public static void main(String[] args) {

        int[][] arr2D = {{1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11, 12}};

        //to print from beginning to end

        for (int[] each1Darray : arr2D) {
            //   System.out.println(Arrays.toString(each));
            for (int eachElement : each1Darray) {
                System.out.print(eachElement + " ");
            }
        }
    }
}

