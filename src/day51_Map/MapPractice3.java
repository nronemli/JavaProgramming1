package day51_Map;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice3 {
    public static void main(String[] args) {

        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 123000);
        map.put("Antony", 100000);
        map.put("Jimmy", 115000);
        map.put("Jalil", 145000);
        map.put("James", 110000);
        map.put("Conor", 85000);
        map.put("Josh", 117000);
        map.put("Cory", 118000);
        map.put("Anderson", 145000);
        map.put("Steven", 145000);


        //display the names of all employees who has the maximum salary

        int maxSalary = Collections.max(map.values());


        for (Map.Entry<String, Integer> eachPair : map.entrySet()) {
            if(eachPair.getValue()==maxSalary){
                System.out.println(eachPair.getKey());
            }
        }


    }
}
