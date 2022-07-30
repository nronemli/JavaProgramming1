package day28_ArrayList;

import java.util.ArrayList;

public class UniqueElements {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Java");list.add("Html");list.add("Html");list.add("Phyton");
        list.add("C sharp");list.add("C sharp");list.add("Java script");list.add("C++");
        list.add("C++");list.add("C++");list.add("Html");list.add("SQL");list.add("SQL");
        list.add("Java");

        System.out.println(list);
        ArrayList<String> unique = new ArrayList<>();

        for (String each : list) {
            if (list.indexOf(each) == list.lastIndexOf(each)){
                unique.add(each);
            }
        }
        System.out.println(unique);
    }
}
