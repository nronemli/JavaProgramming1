package day25_MethodOverloading;

import java.util.Arrays;

public class AddElement {

    /*1. create a return method called addInteger that can add an Integer  after the  last index of an integer array*/

    public static int[] addIntToArray(int[] array, int number) {

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
    public static double[] addDouble(double[] array, double element) {
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
    public static String[] addString(String[] array, String element) {

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

    public static char[] addChar(char[] array, char element) {

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
        int[] array1 = {10, 20, 30, 40};

        array1 = addIntToArray(array1, 50);
        System.out.println(Arrays.toString(array1));

        double[] array2 = {1.5, 2.4, 4.5};
        array2 = addDouble(array2, 5.5);
        System.out.println(Arrays.toString(array2));

        String[] names = {"aynur", "selim", "emin", "necip"};
        names = addString(names, "onemli");
        names= addString(names,"2022");
        System.out.println(Arrays.toString(names));

        char[] chars= {'a','b','c','d'};
        chars = addChar(chars,'e');
        System.out.println(Arrays.toString(chars));

    }


}
