package day24_CustomMethodsReturnMethod;

import java.util.Arrays;

public class Task6 {


   public static int[] addElement(int[] array1, int newNumber){

       int[] newArray= new int[array1.length+1]; //create a new array +1 bigger than array1,
                                                // since we need to add one number
       int i = 0;

        //for each element in the array1
       for (int eachElement : array1) {
        newArray[i++]= eachElement; //put all elements of array1 into new array
       }

/*
       for (int i1 = array1.length - 1; i1 >= 0; i1--) {
           newArray[i1] = i1++;
       }
       */

       newArray[i] = newNumber; //add new number to the new array
       return newArray;

   }

    public static void main(String[] args) {
        int[] array1 ={1,2,3};
        System.out.println(Arrays.toString(addElement(array1,5)));
    }




    /*
     6. create a method named addElement that takes one integer array and one integer,
     the method can add the Integer number after the  last index of the integer array and returns the new array

    			Ex:
    				arr ={1,2,3};
    				num = 4;

    				addElement(arr, num) ==> {1,2,3,4}
     */
}
