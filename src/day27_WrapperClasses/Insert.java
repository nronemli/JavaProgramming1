package day27_WrapperClasses;

public class Insert {

/*
1. Insert Task:
		1.1 Create a method named insert that passes three parameters: integer array, integer index,
		 integer element. the method inserts the given element to the given index of the array
		 and returns the new array
				Ex:
					arr = {10, 20, 30, 40, 50};

					insert(arr, 2, 100) ==> {10, 20, 100, 30, 40, 50}
*/
    public static int[] insert(int[] array, int index, int element) {

        if (index < 0 || index >= array.length) {
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }

        int result[] = new int[array.length + 1]; //new element array
        result[index] = element;

        int j = 0;
        for (int each = 0; each < array.length; each++,j++) {
            if (each == index) {
                j++;
            }
            result[j] = array[each];

        }
        return result;
    }

    public static double[] insert(double[] array, int index, double element) {

        if (index < 0 || index >= array.length) {
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }

        double result[] = new double[array.length + 1]; //new element array
        result[index] = element;

        int j = 0;
        for (int each = 0; each < array.length; each++,j++) {
            if (each == index) {
                j++;
            }
            result[j] = array[each];

        }
        return result;
    }

    public static char[] insert(char[] array, int index, char element) {

        if (index < 0 || index >= array.length) {
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }

        char result[] = new char[array.length + 1]; //new element array
        result[index] = element;

        int j = 0;
        for (int each = 0; each < array.length; each++,j++) {
            if (each == index) {
                j++;
            }
            result[j] = array[each];

        }
        return result;
    }


    public static String[] insert(String[] array, int index, String element) {

        if (index < 0 || index >= array.length) {
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }

        String result[] = new String[array.length + 1]; //new element array
        result[index] = element;

        int j = 0;
        for (int each = 0; each < array.length; each++,j++) {
            if (each == index) {
                j++;
            }
            result[j] = array[each];

        }
        return result;
    }




}
