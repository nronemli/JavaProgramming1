package day51_Map;

import day36_Inheritance.scrumTask.ScrumTeam;

import javax.print.DocFlavor;
import java.util.*;

public class MapIteration {
    public static void main(String[] args) {

        Map<String, Integer> studentGrade = new HashMap<>();
        studentGrade.put("Nur", 76);
        studentGrade.put("Masite", 73);
        studentGrade.put("Said", 70);
        studentGrade.put("Selim", 100);
        studentGrade.put("Necip", 89);
        studentGrade.put("Emin", 55);
        studentGrade.put("Emin", 65);

/*
        Set<String> keys = studentGrade.keySet();
        for (String each : keys) {
            //display each key, and the value of each key
            //System.out.println(each+" : " +studentGrade.get(each));
            //display each key, and increase and replace each key value by 5
            System.out.println(studentGrade.replace(each, studentGrade.get(each) + 5));
        }
*/
        //display all the student who made less than 90
        for (String eachKey : studentGrade.keySet()) {
            Integer eachValue = studentGrade.get(eachKey);
            if (eachValue < 90) {
                System.out.println(eachValue);
            }
        }

        //map for early birds and angry birds sorting
        Map<String, Integer> earlyBirds = new HashMap<>(); //scre >=90
        Map<String, Integer> angryBirds = new HashMap<>(); //score<90

        for (String key : studentGrade.keySet()) {
            Integer value = studentGrade.get(key);
            if (value >= 90) {
                earlyBirds.put(key, value);
            } else {
                angryBirds.put(key, value);
            }

        }
        System.out.println("angryBirds = " + angryBirds);
        System.out.println("earlyBirds = " + earlyBirds);

        Set<String> names = studentGrade.keySet();

        System.out.println("____________________________________");

        //get all the scores of the values

        //Collection<Integer> scores = studentGrade.values();
        //System.out.println(scores);

        List<Integer> scores = new ArrayList<>(studentGrade.values());
        System.out.println(scores);
        for (Integer value : studentGrade.values()) {
            System.out.println(value);
        }

        System.out.println("__________________________________");
        int maxScore = Integer.MAX_VALUE;
        int minScore = Integer.MIN_VALUE;

        for (Integer score : studentGrade.values()) {
            if (score > maxScore) {
                maxScore = score;
            }

            if (score < minScore) {
                minScore = score;
            }
        }
        System.out.println("maxScore = " + maxScore);
        System.out.println("minScore = " + minScore);
        System.out.println("+++++++++++++2nd solution++++++++++++++");
        int max = Collections.max(studentGrade.values());
        int min = Collections.min(studentGrade.values());

        System.out.println("minScore = " + minScore);
        System.out.println("maxScore = " + maxScore);
        System.out.println("______________________________________");

        //count how many students has the score of 95 or greater
        int count = 0;

        for (Integer value : studentGrade.values()) {
            if (value >= 95) {
                count++;
            }
        }

        System.out.println("95 or greater = " + count);

        System.out.println("_______________________________________");
        int count2=0;
        for (String eachKey : studentGrade.keySet()) {
            Integer eachScore = studentGrade.get(eachKey);
            if(eachScore>=65){
                count2++;
            }
        }
        System.out.println("count2 = " + count2);

        System.out.println("__Iterate by set(key and value)___ entrySet()");

        for (Map.Entry<String, Integer> entry : studentGrade.entrySet()) {
            System.out.println(entry); //print each entry
            System.out.println(entry.getKey()); //only the key
            System.out.println(entry.getValue()); //only the values
        }


        System.out.println("____________________________________");









    }







}
