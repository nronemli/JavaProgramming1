package day51_Map;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice2 {

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
        map.put("Anderson", 125000);
        map.put("Steven", 135000);

        //1 Who has the maximum salary
        int maxSalary = Integer.MIN_VALUE;
        String name = "";

        int minSalary = Integer.MAX_VALUE;
        String name1 = "";

        for (Map.Entry<String, Integer> eachSet : map.entrySet()) {
            String eachKey = eachSet.getKey();
            int eachValue = eachSet.getValue();
            if (eachValue > maxSalary) {
                maxSalary = eachValue;
                name = eachKey;
            }
            if (eachValue > minSalary) {
                minSalary = eachValue;
                name1 = eachKey;
            }
        }
        System.out.println("Max salary name = " + name);
        System.out.println("minSalary name = " + name1);

        //3: how many emp have salary from 120-150
        int count = 0;

        for (Integer eachValue : map.values()) {
            if (eachValue > 120000 && eachValue <= 150000) {
                count++;
            }
        }
        System.out.println("Emp with salary betweeen 120-150: " + count);

        //4: display the names of employees who are making less than 118k?
        for (Map.Entry<String, Integer> eachPair : map.entrySet()) {
            if (eachPair.getValue() < 118000) {
                System.out.println("Emp makign less than 118k?" + eachPair.getKey());
            }
        }
        //5: Increase the salaary of each employee by 10K

        for (Map.Entry<String, Integer> eachPair : map.entrySet()) {
            if (eachPair.getValue() < 120000) {
                //eachPair.setValue(eachPair.getValue()+10000); //both works different way
              map.replace(eachPair.getKey(), eachPair.getValue() + 10000);
            }

        }
        System.out.println(map);
    }
}
