package day26_CustomMethodsPractice;

import java.util.Arrays;

public class RemoveElement {

        //removes the index from the array, returns new array
    public static int[] removeElement(int[] array, int index) {
        //size of the new array will be smaller than the main array
        if (index < 0 || index > array.length - 1) {//if index is less than 0 or greater than the lasst index in the array
            System.err.println("Invalid Index:" + index);
            System.exit(0);
        }
        int[] result = new int[array.length - 1];

        int j = 0;  //index of the new result array
        for (int i = 0; i < array.length; i++) {
            if (i == index) { // element in the given index in the array
                continue; //ignore the element and skip
            }
            result[j++] = array[i];
        }
        return result;
    }


    public static void main(String[] args) {
        int[]numbers={100,200,300,400,500,600};
        numbers =removeElement(numbers,1);
        System.out.println(Arrays.toString(numbers));


    }

}
