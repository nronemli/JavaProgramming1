package day51_Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapMethods {
    public static void main(String[] args) {

        //key   //value
        Map<String, Integer> studentGrade = new HashMap<>();
        studentGrade.put("Nur", 76);
        studentGrade.put("Masite", 73);
        studentGrade.put("Said", 70);
        studentGrade.put("Selim", 100);
        studentGrade.put("Necip", 89);
        studentGrade.put("Emin", 55);
        studentGrade.put("Emin", 65); //this one will be accepted , dublicated will removed, only last one will be accepted

        //display score of Nur(key)
        System.out.println("studentGrade.get(\"Nur\") = " + studentGrade.get("Nur"));

        //replace the value (key, new value)
        studentGrade.replace("Emin", 78);
        //remove nur from map, the value and key will be removed same time
        studentGrade.remove("Nur");
        //
        boolean r1 = studentGrade.containsKey("Necip");
        System.out.println("r1 = " + r1);
        boolean r2 = studentGrade.containsValue("78");
        System.out.println("r2 = " + r2);

        System.out.println("studentGrade.isEmpty() = " + studentGrade.isEmpty());
        //if the size is not 0 , will return false
        System.out.println("studentGrade = " + studentGrade.size());
        System.out.println("studentGrade = " + studentGrade);

        Map<String, Integer> students = new HashMap<>();
        students.putAll(studentGrade);

        System.out.println(studentGrade == students);
        System.out.println(studentGrade.equals(students));
        System.out.println("students = " + students);

        students.clear();
        System.out.println("students = " + students);

        //==
        Map<String, Integer>map1= new HashMap<>();
        map1.putAll(studentGrade);
        Map<String, Integer>map2= new HashMap<>();
        map2.putAll(studentGrade);
        System.out.println("map2 = " + map2);
        System.out.println("map1 = " + map1);

        System.out.println(map1==map2); //false because two different objects map1, and map2 new keyword.
        System.out.println(map1.equals(map2)); //true because they have same values


        //important ones












    }

}
