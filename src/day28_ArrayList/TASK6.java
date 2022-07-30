package day28_ArrayList;
import java.util.ArrayList;
import java.util.Arrays;

public class TASK6 {
   public static void main(String[] args) {

      ArrayList<Integer>list= new ArrayList<>();
      list.addAll(Arrays.asList(1,2,3,4,5));
      int min = list.get(0);
      for (Integer each : list) {
         if (each < min) {
            min = each;
         }
      }
      System.out.println(min);
   }
}
/* 6. Write a program that can find the minimum number from an ArrayList of integers
    Ex:
    list = [1,2,3,4,5];
    output:   1
 */
