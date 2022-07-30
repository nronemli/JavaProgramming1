package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueElemenetss {

    public static void main(String[] args) {

        ArrayList<Integer> list= new ArrayList<>();
        list.addAll(Arrays.asList(1,1,2,3,4,5,5,6,7,7,8,9,9));
        ArrayList<Integer>unique= new ArrayList<>();

        for (Integer eachElement : list) {
            int frequency = Collections.frequency(list,eachElement); //finds the frequency of each element
          //  System.out.println(frequency);
            if(frequency==1){ //if frequency equals to 1
            unique.add(eachElement);    //add each element to unique arraylist
            }
        }
        System.out.println(unique);

        System.out.println("+++++++++++second solution++++++++++");
        ArrayList<Integer> list2= new ArrayList<>();
        list2.addAll(Arrays.asList(1,1,2,3,4,5,5,6,7,7,8,9,9));
        ArrayList<Integer>unique2= new ArrayList<>(list2);//add all elements to unique 2
        // remove all from unique 2 if ( frequency of collections list greater than 1)
        unique2.removeIf(p-> Collections.frequency(list2,p)>1);
        System.out.println(unique2);





    }
}
