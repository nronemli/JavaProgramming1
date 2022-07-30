package day28_ArrayList;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class TASK3 {
    public static void main(String[] args) {

        ArrayList<Integer>list= new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5));

        ArrayList<Integer>listNew= new ArrayList<>();

        for (int each = 0; each < list.size(); each++) {
            if(list.get(each) %2 !=0){
            list.set(each, list.get(each)*2);
            }
        }
        System.out.println(list);

    }
}
 /*3. write a program that can multiply each odd number by 2
         ex: list = [1,2,3,4,5];
         output: [2,2,6,4,10]
*/