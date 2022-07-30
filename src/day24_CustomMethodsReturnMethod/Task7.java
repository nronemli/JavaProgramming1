package day24_CustomMethodsReturnMethod;

import java.util.Arrays;

public class Task7 {

        public static int [] merge(int[] array1, int[]array2){

            //new array length defined by length of two arrays
            int newMergedArray[]= new int[array1.length+array2.length];

            int i=0;
            for (int eachElement : array1) {
                newMergedArray[i++] = eachElement; //put each elements of array1 into new array
            }
            for (int eachElement : array2) {
                newMergedArray[i++]= eachElement;
            }

            return newMergedArray;
        }

    public static void main(String[] args) {

            int array1[]= {1,2,3};
            int array2[]={3,4,5};

        System.out.println(Arrays.toString(merge(array1,array2)));

        }
    /*
    7. Create a method named merge that passes two integer array parameters, the method can merge two integer arrays and return the new array

				Ex:
					arr1 = {1,2,3}
					arr2 = {4,5,6}

					merge(arr1, arr2) ====> {1,2,3,4,5,6}

     */
}
