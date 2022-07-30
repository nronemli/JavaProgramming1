package day22_MultiDimentionalArray;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
                            //i1    i2

        int[][] num = {{1, 2, 3}, {4, 5, 6}};

        //System.out.println(Arrays.deepToString(num)); //original array

        for (int i = num.length - 1; i >= 0; i--) { //index of single dimentional
            for (int j = num[i].length - 1; j >= 0; j--) { //j: index of elements
                System.out.print(num[i][j] + " ");
            }


        }
    }
}
