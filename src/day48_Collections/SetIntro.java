package day48_Collections;

import java.lang.reflect.Array;
import java.util.*;

public class SetIntro {
    public static void main(String[] args) {

        //SET: DOES NOT ACCEPT duplicate elements
        System.out.println("______________HASH SET EXAMPLE____________________");
        Set<Integer> hashSet = new HashSet<>();
        //hashSet.add(10);
        //10 was first added, but it stored 200 >>>order is RANDOM!!
        hashSet.addAll(Arrays.asList(10,200,300,40,90));
        System.out.println(hashSet);
        //NO duplicates are allowed, it only stored 5 elements,does not store duplicated values
        //Cannot retrieve the value at certain index with the get method unlike LIST
        //hashSet.get(4);
        hashSet.addAll(Arrays.asList(10,200,300,40,90));
        hashSet.addAll(Arrays.asList(10,200,300,40,90));
        hashSet.addAll(Arrays.asList(10,200,300,40,90));
        hashSet.addAll(Arrays.asList(10,200,200,200,200,200,300,40,90));
        //can accept NULL values, it will only add one, no  duplicates
        hashSet.addAll(Arrays.asList(null,null));
        System.out.println("hashSet = " + hashSet); //random printout from the hashSet from hashCode
        hashSet.hashCode();
        System.out.println(hashSet);
        System.out.println("______________LInked HASHSET EXAMPLE____________________");
        Set<Integer> linkedHashSet= new LinkedHashSet<>();
        //does not accept duplicate elements
        linkedHashSet.addAll(Arrays.asList(10,200,300,40,90,null));
        linkedHashSet.addAll(Arrays.asList(10,200,300,40,90,null));
        //10,200,300,40,90,null it maintains the insertion order
        //it accepts null values
        //use it to remove objects
        System.out.println("linkedHashSet = " + linkedHashSet);
        linkedHashSet.remove(10); //10 removed
        System.out.println(linkedHashSet); //200,300,40,90,null
        System.out.println("______________TREESET EXAMPLE____________________");
        Set<Integer> treeSet= new TreeSet<>();
        //10,40,90,200,300 it sorts it in ascending order
        //does not accept NULL values, null pointer exception it will throw
        treeSet.addAll(Arrays.asList(10,200,300,40,90,90,90));
        System.out.println("treeSet = " + treeSet);

    }
}
