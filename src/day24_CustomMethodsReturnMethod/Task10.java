package day24_CustomMethodsReturnMethod;

import java.util.Arrays;

public class Task10 {
    public static int[] removeElement(int[] array, int num) {

        int[] newArray = new int[array.length - 1];

        int i = 0;
        for (int eachElement : array) {
            if (eachElement == num) {
                continue;
            }
            i++;
        }

  //      newArray[i]= num;
            return newArray;

        }

    public static void main(String[] args) {

        int arr[]= {1,2,3,4};

        arr = removeElement(arr,3);
        System.out.println(Arrays.toString(arr));

    }
    }




    /*
    create a method named removeElement that passes one integer array and one integer, the method removes the integer index from the integer array and returns the new array
            Ex:
                array = {10, 20, 30, 40, 50, 60}
                index = 2


                removeElement(array, index) ==== {10, 20, 40, 50, 60}

     */


