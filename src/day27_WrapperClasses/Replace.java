package day27_WrapperClasses;

import java.util.Arrays;

public class Replace {

    //replace the element in the given array with new element
    public static int[] replace(int[] array, int index, int newElement) {

        if(index<0 || index> array.length-1){
            System.err.println("Invalid index: "+index);
            System.exit(0);
        }

        array[index] = newElement;
        return array;
    }
    //replace the element in the given array with new element
    public static double[] replace(double[] array, int index, double newElement) {

        if(index<0 || index> array.length-1){
            System.err.println("Invalid index: "+index);
            System.exit(0);
        }

        array[index] = newElement;
        return array;
    }
    //replace the element in the given array with new element
    public static char[] replace(char[] array, int index, char newElement) {

        if(index<0 || index> array.length-1){
            System.err.println("Invalid index: "+index);
            System.exit(0);
        }

        array[index] = newElement;
        return array;
    }
    //replace the element in the given array with new element
    public static String[] replace(String[] array, int index, String newElement) {

        if(index<0 || index> array.length-1){
            System.err.println("Invalid index: "+index);
            System.exit(0);
        }

        array[index] = newElement;
        return array;
    }


    public static void main(String[] args) {
        int []arr= {1,2,3,4};
        arr=replace(arr,2,8);
        System.out.println(Arrays.toString(arr));

        String[]arr2={"aynur","selim","necip","onemli"};
        arr2= replace(arr2,3,"emin");
        System.out.println(Arrays.toString(arr2));

    }
}
