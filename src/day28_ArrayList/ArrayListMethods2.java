package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(200);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);

        //200 at index 1
        int num = 1;
        list.remove(num);
        System.out.println(list);

        Integer num1 = 200;
        list.remove(num1);
        System.out.println(list);
        boolean r= list.remove(num1); //return type boolean
        System.out.println(r); //true

        //remove(int index) = remove element
        //remove(object) = remove the actual element

    }
}
