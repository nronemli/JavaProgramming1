package day25_MethodOverloading;

import java.util.Arrays;

public class AddElementsOverloading {

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


    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        numbers = addElement(numbers, 6);
        char[] chars = {'A', 'B', 'C'};
        chars = addElement(chars, 'D');
        String[] names = {"Nur", "Onemli"};
        names = addElement(names,"cydeo");


        System.out.println("numbers = " + Arrays.toString(numbers));
        System.out.println("chars = " + Arrays.toString(chars));
        System.out.println("names = " + Arrays.toString(names));

    }
}
