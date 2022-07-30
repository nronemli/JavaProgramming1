package utilities;

import java.util.Arrays;

public class ArraysUtility {

    //prints each integer of an int array in separate lines

    //print each integer number in array
    public static void printEachElement(int[] array) {

        for (int eachElement : array) {
            System.out.println(eachElement);
        }
    }

    //print each double number in array
    public static void printEachElement(double[] array) {

        for (double eachElement : array) {
            System.out.println(eachElement);
        }
    }

    //print each char in array
    public static void printEachElement(char[] array) {

        for (char eachElement : array) {
            System.out.println(eachElement);
        }
    }

    //print each String in array
    public static void printEachElement(String[] array) {
        for (String eachElement : array) {
            System.out.println(eachElement);
        }
    }

    //return the maximum number from int array
    public static int maxNum(int[] num1) {
        Arrays.sort(num1);
        return num1[num1.length - 1];
    }

    //return the maximum number from double array
    public static double maxNum(double[] num1) {
        Arrays.sort(num1);
        return num1[num1.length - 1];
    }

    public static int minNum(int[] num1) {
        Arrays.sort(num1);
        return num1[0];
    }

    public static double minNum(double[] num1) {
        Arrays.sort(num1);
        return num1[0];

        //check if the given integer contains in the given array


    }

    //check if the given integer is contained in the given array. returns boolean.
    public static boolean contains(int[] array, int element) {
        boolean result = false;
        for (int eachElement : array) {
            if (eachElement == element) {
                result = true;
            }
        }
        return result;

    }

    //checks if the given double is contained in the given array. returns boolean.
    public static boolean contains(double[] array, double element) {
        boolean result = false;
        for (double eachElement : array) {
            if (eachElement == element) {
                result = true;
            }
        }
        return result;

    }

    //checks if the given char is contained in the given array. returns boolean.
    public static boolean contains(char[] array, char element) {
        boolean result = false;
        for (char eachElement : array) {
            if (eachElement == element) {
                result = true;
            }
        }
        return result;

    }

    //checks if the given String is contained in the given array. returns boolean.
    public static boolean contains(String[] array, String element) {

        boolean result = false;

        for (String each : array) {
            if (each.equals(element)) {
                result = true;
            }
        }

        return result;
    }

    /*1. create a return method called addInteger that can add an Integer  after the  last index of an integer array*/
    public static int[] addElement(int[] array, int number) {

        int[] newArray = new int[array.length + 1];

        int i = 0;
        for (int eachElement : array) { //look at each element in the array
            newArray[i] = eachElement; //assign each elements in array to the new array
            i++;
        }

        newArray[i] = number; //assign the new number to the NewArray[i= last index]
        return newArray;
    }

    /*2. create a return method called addDouble that can add a double after the last index of a double array
     */
    public static double[] addElement(double[] array, double element) {
        double[] result = new double[array.length + 1];

        int i = 0;

        for (double eachElement : array) {
            result[i++] = eachElement;
        }

        result[i] = element;//element needs to be added to the last index
        //result[result.length-1]=element; //can be done as well
        return result;
    }

    /*3. create a return method called addString that can add a String after the last index of a String array
     */
    public static String[] addElement(String[] array, String element) {

        String[] result = new String[array.length + 1];

        int i = 0;

        for (String eachElement : array) {
            result[i++] = eachElement;
        }

        result[i] = element;//element needs to be added to the last index
        //result[result.length-1]=element; //can be done as well
        return result;
    }

    /* 4. create a return method called addChar that can add a char after last index of a char array
     */
    public static char[] addElement(char[] array, char element) {

        char[] result = new char[array.length + 1];

        int i = 0;

        for (char eachElement : array) {
            result[i++] = eachElement;
        }
        result[i] = element;//element needs to be added to the last index
        //result[result.length-1]=element; //can be done as well
        return result;
    }

    //frequency of element in an array integer array
    public static int frequencyOfElement(int[] array, int element) {
        int count = 0;
        for (int each : array) {
            if (each == element) {
                count++;
            }
        }
        return count;
    }

    //frequency of element in an array double array
    public static double frequencyOfElement(double[] array, double element) {
        int count = 0;
        for (double each : array) {
            if (each == element) {
                count++;
            }
        }
        return count;
    }
    //frequency of element in an array char array

    public static int frequencyOfElement(char[] array, char element) {
        int count = 0;
        for (char each : array) {
            if (each == element) {
                count++;
            }
        }
        return count;
    }

    //frequency of element in an array String array
    public static int frequencyOfElement(String[] array, String element) {
        int count = 0;
        for (String each : array) {
            if (each.equals(element)) {
                count++;
            }
        }
        return count;
    }

    //returns the unique elements in the int array
    public static int[] uniqueElements(int[] array) {
        int[] result = {};
        for (int each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    //returns the unique elements of the array as a new array
    public static double[] uniqueElements(double[] array) {
        double[] result = {};
        for (double each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    //returns the unique elements of the array as a new array
    public static char[] uniqueElements(char[] array) {
        char[] result = {};
        for (char each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    //returns the unique elements of the array as a new array
    public static String[] uniqueElements(String[] array) {
        String[] result = {};
        for (String each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

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

    //removes the index from the array, returns new array
    public static double[] removeElement(double[] array, double index) {
        //size of the new array will be smaller than the main array
        if (index < 0 || index > array.length - 1) {//if index is less than 0 or greater than the lasst index in the array
            System.err.print("Invalid Index:" + index);
            System.exit(0);
        }
        double[] result = new double[array.length - 1];

        int j = 0;  //index of the new result array
        for (int i = 0; i < array.length; i++) {
            if (i == index) { // element in the given index in the array
                continue; //ignore the element and skip
            }
            result[j++] = array[i];
        }
        return result;
    }

    //removes the index from the array, returns new array
    public static char[] removeElement(char[] array, char index) {
        //size of the new array will be smaller than the main array
        if (index < 0 || index > array.length - 1) {//if index is less than 0 or greater than the lasst index in the array
            System.err.print("Invalid Index:" + index);
            System.exit(0);
        }
        char[] result = new char[array.length - 1];

        int j = 0;  //index of the new result array
        for (int i = 0; i < array.length; i++) {
            if (i == index) { // element in the given index in the array
                continue; //ignore the element and skip
            }
            result[j++] = array[i];
        }
        return result;
    }

    //removes the index from the array, returns new array
    public static String[] removeElement(String[] array, int index) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }

        String[] result = new String[array.length - 1]; //1,2

        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == index) {  // if the index of array is matching with the given index
                continue; // skip
            }
            result[j++] = array[i];
        }

        return result;
    }

    //merge the given two arrays and return the new array
    public static int[] merge(int[] array1, int[] array2) {

        int[] mergedArray = {};

        for (int eachElements : array1) {
            mergedArray = addElement(mergedArray, eachElements);
        }
        for (int eachElement : array2) {
            mergedArray = addElement(mergedArray, eachElement);
        }
        return mergedArray;
    }

    //merge the given two arrays and return the new array
    public static double[] merge(double[] array1, double[] array2) {

        double[] mergedArray = {};

        for (double eachElements : array1) {
            mergedArray = addElement(mergedArray, eachElements);
        }
        for (double eachElement : array2) {
            mergedArray = addElement(mergedArray, eachElement);
        }
        return mergedArray;
    }

    //merge the given two arrays and return the new array
    public static char[] merge(char[] array1, char[] array2) {

        char[] mergedArray = {};

        for (char eachElements : array1) {
            mergedArray = addElement(mergedArray, eachElements);
        }
        for (char eachElement : array2) {
            mergedArray = addElement(mergedArray, eachElement);
        }
        return mergedArray;
    }

    //merge the given two arrays and return the new array
    public static String[] merge(String[] array1, String[] array2) {

        String[] mergedArray = {};

        for (String eachElements : array1) {
            mergedArray = addElement(mergedArray, eachElements);
        }
        for (String eachElement : array2) {
            mergedArray = addElement(mergedArray, eachElement);
        }
        return mergedArray;
    }

    //reverse the array, returns new array
    public static int[] reverseArray(int[] array) {

        int[] reversedArray = new int[array.length];

        int j = 0; //index of reversed array
        for (int i = array.length - 1; i >= 0; i--) {
            reversedArray[j] = array[i]; //assign index of array to reversed array index
            j++; //reversed array must increase each time
        }
        return reversedArray;
    }

    //reverse the array, returns new array
    public static double[] reverseArray(double[] array) {

        double[] reversedArray = new double[array.length];

        int j = 0; //index of reversed array
        for (int i = array.length - 1; i >= 0; i--) {
            reversedArray[j] = array[i]; //assign index of array to reversed array index
            j++; //reversed array must increase each time
        }
        return reversedArray;
    }

    //reverse the array, returns new array
    public static char[] reverseArray(char[] array) {

        char[] reversedArray = new char[array.length];

        int j = 0; //index of reversed array
        for (int i = array.length - 1; i >= 0; i--) {
            reversedArray[j] = array[i]; //assign index of array to reversed array index
            j++; //reversed array must increase each time
        }
        return reversedArray;
    }

    //reverse the array, returns new array
    public static String[] reverseArray(String[] array) {

        String[] reversedArray = new String[array.length];

        int j = 0; //index of reversed array
        for (int i = array.length - 1; i >= 0; i--) {
            reversedArray[j] = array[i]; //assign index of array to reversed array index
            j++; //reversed array must increase each time
        }
        return reversedArray;
    }

    //replace the element in the given array with the given index to the new element
    public static int[] replace(int[] array, int index, int newElement) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid index: " + index);
            System.exit(0);
        }

        array[index] = newElement;
        return array;
    }

    //replace the element in the given array with the given index to the new element
    public static double[] replace(double[] array, int index, double newElement) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid index: " + index);
            System.exit(0);
        }

        array[index] = newElement;
        return array;
    }

    //replace the element in the given array with the given index to the new element
    public static char[] replace(char[] array, int index, char newElement) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid index: " + index);
            System.exit(0);
        }

        array[index] = newElement;
        return array;
    }

    //replace the element in the given array with the given index to the new element
    public static String[] replace(String[] array, int index, String newElement) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid index: " + index);
            System.exit(0);
        }

        array[index] = newElement;
        return array;
    }


    //replace all matching old num with new number
    public static int[] replaceAll(int[] arr, int oldNum, int newNum) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == oldNum) {
                arr[i] = newNum; //store the new value in the array index
            }
        }
        return arr;
    }

    //replace all matching old num with new number
    public static double[] replaceAll(double[] arr, double oldNum, double newNum) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == oldNum) {
                arr[i] = newNum; //store the new value in the array index
            }
        }
        return arr;
    }

    //replace all matching old num with new number
    public static char[] replaceAll(char[] arr, char oldNum, char newNum) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == oldNum) {
                arr[i] = newNum; //store the new value in the array index
            }
        }
        return arr;
    }

    //replace all matching old num with new number
    public static String[] replaceAll(String[] arr, String oldNum, String newNum) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == oldNum) {
                arr[i] = newNum; //store the new value in the array index
            }
        }
        return arr;
    }

    //remove duplicates from the given array, returns new array
    public static int[] removeDuplicates(int[] array) {
        int[] result = {};

        for (int eachElement : array) {
            if (!ArraysUtility.contains(result, eachElement)) {
                result = ArraysUtility.addElement(result, eachElement);
            }
        }
        return result;
    }

    //remove duplicates from the given array, returns new array
    public static double[] removeDuplicates(double[] array) {

        double[] result = {};
        for (double eachElement : array) {
            if (!ArraysUtility.contains(result, eachElement)) {
                result = ArraysUtility.addElement(result, eachElement);
            }
        }
        return result;

    }

    //remove duplicates from the given array, returns new array
    public static char[] removeDuplicates(char[] array) {

        char[] result = {};

        for (char eachElement : array) {
            if (!ArraysUtility.contains(result, eachElement)) {
                result = ArraysUtility.addElement(result, eachElement);

            }
        }
        return result;
    }

    //remove duplicates from the given array, returns new array
    public static String[] removeDuplicates(String[] array) {

        String[] result = {};

        for (String eachElement : array) {
            if (!ArraysUtility.contains(result, eachElement)) {
                result = ArraysUtility.addElement(result, eachElement);

            }
        }
        return result;
    }


}



