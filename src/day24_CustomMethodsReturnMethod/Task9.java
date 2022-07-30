package day24_CustomMethodsReturnMethod;

import java.util.Arrays;

public class Task9 {

    public static boolean contains(int[] array1, int number) {

        boolean result = false;
        //for each element in the array
        for (int each : array1) {
            if (each == number) {    //check if each element has the number
                result = true;      //return true
            }else {
                System.out.println("does not match this element");
            }
        }
       return result;
    }
    public static void main(String[] args) {
        int[] array1= {1,2,3,4,5};
        System.out.println(Arrays.toString(new boolean[]{contains(array1, 5)}));
    }
}
/*
	9. Create a method named contains that passes one integer array and one integer parameters,
	 the method returns true if the given integer is contained in the given array, otherwise returns false

				Ex:
					arr = {1,2,3,4,5,6,7};
					num = 10;
					contains(arr, num) ===> false

 */