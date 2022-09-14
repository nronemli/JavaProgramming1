package day51_Map;

import java.util.HashMap;
import java.util.Map;

public class MapPractice1 {
    public static void main(String[] args) {

        Map<String, String> employeeMap = new HashMap<>();
        employeeMap.put("Ddene", "F");
        employeeMap.put("Winfred", "M");
        employeeMap.put("Jereme", "M");
        employeeMap.put("Glad", "F");
        employeeMap.put("Desirae", "F");
        employeeMap.put("Kakalina", "F");
        employeeMap.put("Bertrando", "M");
        employeeMap.put("Ajay", "F");
        employeeMap.put("Brigitte", "F");
        employeeMap.put("Derk", "M");
        employeeMap.put("Orlando", "M");
        employeeMap.put("Selle", "F");
        employeeMap.put("Marika", "F");

        
        //1.update the 'm' to male and 'f' to female
        for (String eachKey : employeeMap.keySet()) {
            if(employeeMap.get(eachKey).equalsIgnoreCase("m")){
                employeeMap.replace(eachKey,"Male");
            }
            if(employeeMap.get(eachKey).equalsIgnoreCase("f")){
                employeeMap.replace(eachKey,"female");
            }
        }
        System.out.println("employeeMap = " + employeeMap);
        System.out.println("+++++++++++++Second solution for 1+++++++++++++++");

        for (Map.Entry<String, String> eachSet : employeeMap.entrySet()) {
            if(eachSet.getValue().equalsIgnoreCase("m")){
                eachSet.setValue("Male");
               //second option: employeeMap.replace(eachSet.getKey(),"Male");
            }
            if(eachSet.getValue().equalsIgnoreCase("f")){
                eachSet.setValue("Female");
            }
        }
        System.out.println("employeeMap = " + employeeMap);

        //2.display all the name of female employees
        //try to iterate always by using the pairs: entrySet()
        for (Map.Entry<String, String> eachSet : employeeMap.entrySet()) {
            String eachKey=eachSet.getKey();
            if(eachSet.getValue().equalsIgnoreCase("Female")){
                System.out.println(eachKey);
            }
        }






    }
}
