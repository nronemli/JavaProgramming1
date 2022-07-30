package day25_MethodOverloading;

public class MaxNumber {

    //1. create a method that can return the max number from an integer array
    public static int MaxNumber(int[] array) {

        int maxNumber = array[0];
        for (int eachElement : array) {
            if (eachElement > maxNumber) {
                maxNumber = eachElement;
            }
        }
        return maxNumber;
    }

//2. create a method that can return the max number from double array

    public static double maxNumber(double[] array) {

        double maxNumber = array[0];
        for (double eachElement : array) {
            if (eachElement > maxNumber) {
                maxNumber = eachElement;
            }
        }
        return maxNumber;
    }

//        3. create a method that can return the max number from long array

    public static long maxNumber(long[] array) {

        long maxNumber = array[0];
        for (long eachElement : array) {
            if (eachElement > maxNumber) {
                maxNumber = eachElement;
            }
        }
        return maxNumber;
    }

    // 4. create a method that can return the max number from short array

    public static short maxNumber(short[] array) {

        short maxNumber = array[0];
        for (short eachElement : array) {
            if (eachElement > maxNumber) {
                maxNumber = eachElement;
            }
        }
        return maxNumber;

    }

    //     5. create a method that can return the max number from float array
    public static float maxNumber(float[] array) {

        float maxNumber = array[0];
        for (float eachElement : array) {
            if (eachElement > maxNumber) {
                maxNumber = eachElement;
            }
        }
        return maxNumber;

    }
    // 6. create a method that can return the max number from byte array
    public static byte maxNumber(byte[] array) {

        byte maxNumber = array[0];
        for (byte eachElement : array) {
            if (eachElement > maxNumber) {
                maxNumber = eachElement;
            }
        }
        return maxNumber;
    }
}












/*Task 2:
        1. create a method that can return the max number from an integer array

        2. create a method that can return the max number from double array

        3. create a method that can return the max number from long array

        4. create a method that can return the max number from short array

        5. create a method that can return the max number from float array

        6. create a method that can return the max number from byte array
*/