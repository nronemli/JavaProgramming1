package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArrayAndArrayList {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6};
        //6,5,4,3,2,1

        int j = 0;
        int[] result = new int[array.length];
        for (int each = array.length - 1; each >= 0; each--) {
            result[j] = array[each];
            j++;
        }
        System.out.println(Arrays.toString(result));
        System.out.println("+++++++++++++reverse array list +++++++++++++++");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));

        ArrayList<Integer> reversedList = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            int each = list.get(i);
            reversedList.add(each);
        }
        System.out.println(reversedList);



    }
}
