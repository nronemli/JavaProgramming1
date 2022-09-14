package day24_CustomMethodsReturnMethod;

import java.util.Arrays;
import java.util.concurrent.LinkedTransferQueue;

public class Task8 {


    public static int[] reverseArray(int[] array1){

        int [] newArray= new int[array1.length]; //create new array to store reversed array, length of array1

       int i= 0;
        for (int eachNum = array1.length - 1; eachNum >= 0; eachNum--) {
            newArray[i++] = array1[i];
        }
        return newArray;

    }

    public static void main(String[] args) {
        int array1[] = {10,20,30,40};
       System.out.println(Arrays.toString(reverseArray(array1)));
    }



    /*
    8. Create method named reverse that passes an integer array parameter,
     the method can return the reversed array

				Ex:
					arr = {10, 20, 30, 40};

					reverse(arr) ==> {40, 30, 20, 10}

     */

}
