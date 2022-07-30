package day24_CustomMethodsReturnMethod;

import java.util.Arrays;

public class Task5 {

                                // array name array //frequency number we are loooking for
    public static int frequencyOfElement(int[]array, int num){

        int count = 0;

        for (int element : array) { //look at each element of array
            if(element==num){  //if each element of array is same as the frequency number we are lookig for i.e 1
                count++; //increase count and return count
            }

        }
        return count;
    }

    public static void main(String[] args) {
        int[] array ={1,1,1,1,1,2,2};
        System.out.println(frequencyOfElement(array,1));

    }


    /*

    5. create method that accepts one integer array and one integer number and returns the frequency of the number

                    Ex:
                        int[] array ={1,1,1,1,1,2,2};

                        frequency(array, 1) ==> 5

     */
}
