package day51_Map;

import java.util.*;

public class MapClasses {
    public static void main(String[] args) {

        System.out.println("_________LinkedHashMap____________");
        //faster, used a lot more because of peformance
        //order is not guaranteed, random
             //key   value
        Map<Integer,String> hashMap= new HashMap<>();

        hashMap.put(10,"Selim");
        hashMap.put(20,"Emin");hashMap.put(3,"Necip");
        hashMap.put(2,"Nur"); //automatically gets removed because duplication
        hashMap.put(2,"Onemli"); //accepts last inserted one so Nur will be deleted
        System.out.println("hashMap = " + hashMap);
        hashMap.put(3,"Nur");
        hashMap.put(4,"Nur"); //value can be duplicated
        hashMap.put(5,"Nur"); //value can be duplicated
        hashMap.put(null,"Cihad");//null value is accepted

        System.out.println("_________LinkedHashMap____________");
        Map<Integer,String> linkedHashMap= new LinkedHashMap<>();
        //key cannot be duplicated
        //order is preserved
        //it accepts one null key , value can be null many times
        linkedHashMap.put(10,"Selim");
        linkedHashMap.put(2,"Emin");
        linkedHashMap.put(3,"Necip");
        linkedHashMap.put(4,"Onemli");
        linkedHashMap.put(7,"Nur");
        linkedHashMap.put(12,"Panda");
        linkedHashMap.put(null,"Null");
        System.out.println("linkedHashMap = " + linkedHashMap);
        System.out.println("_________________TreeMap_____________");

        Map<Integer,String> treeMap= new TreeMap<>();
        //maintains the sorted order
        //does NOT accept null key
        //if you want to store all id from smallest to largest treeMap is the best to use
        treeMap.put(10,"Selim");
        treeMap.put(2,"Emin");
        treeMap.put(3,"Necip");
        treeMap.put(4,"Onemli");
        treeMap.put(7,"Nur");
        treeMap.put(12,"Panda");
        //treeMap.put(null,"null"); //null pointer acceptation occurs
        System.out.println("treeMap = " + treeMap);

        System.out.println("______________HashTable_______________");

        //order is random
        //does not accepts null key
        Map<Integer,String> hashtable= new Hashtable<>();
        hashtable.put(10,"Selim");
        hashtable.put(2,"Emin");
        hashtable.put(3,"Necip");
        hashtable.put(4,"Onemli");
        hashtable.put(7,"Nur");
        hashtable.put(12,"Panda");




    }
}
