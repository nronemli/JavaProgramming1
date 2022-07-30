package day26_CustomMethodsPractice;

public class mergeTwoArrays {

    public static int[] merge(int[] array1, int[] array2) {

        int[] newArray = new int[array1.length + array2.length];

        int i = 0;
        for (int each : array1) {
            newArray[i] = each;
            i++;
        }

        for (int each : array2) {
            newArray[i] = each;
            i++;
        }

        return newArray;
    }


}
