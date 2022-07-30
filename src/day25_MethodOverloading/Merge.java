package day25_MethodOverloading;

public class Merge {

    // 1. create a method that can merge two integer arrays.
    public static int[] merge(int[] array1, int[] array2) {

        int[] newArray = new int[array1.length + array2.length];

        int i = 0;
        for (int eachElement : array1) {
            newArray[i] = eachElement;
            i++;
        }
        for (int eachElement : array2) {
            newArray[i] = eachElement;
            i++;
        }
        return newArray;
    }
	//2. create a method that can merge two double arrays.
    public static double[] merge(double[] array1, double[] array2) {

        double[] newArray = new double[array1.length + array2.length];

        int i = 0;
        for (double eachElement : array1) {
            newArray[i] = eachElement;
            i++;
        }
        for (double eachElement : array2) {
            newArray[i] = eachElement;
            i++;
        }
        return newArray;
    }

	//3. create a method that can merge two char arrays.
    public static char[] merge(char[] array1, char[] array2) {

        char[] newArray = new char[array1.length + array2.length];

        int i = 0;
        for (char eachElement : array1) {
            newArray[i] = eachElement;
            i++;
        }
        for (char eachElement : array2) {
            newArray[i] = eachElement;
            i++;
        }
        return newArray;
    }

	//4. create a method that can merge two String arrays.

    public static String[] merge(String[] array1, String[] array2) {

        String[] newArray = new String[array1.length + array2.length];

        int i = 0;
        for (String eachElement : array1) {
            newArray[i] = eachElement;
            i++;
        }
        for (String eachElement : array2) {
            newArray[i] = eachElement;
            i++;
        }
        return newArray;
    }


}
