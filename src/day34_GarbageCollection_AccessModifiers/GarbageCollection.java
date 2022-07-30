package day34_GarbageCollection_AccessModifiers;


import day30_CustomClass.Car;
import day30_CustomClass.Dog;

import java.util.ArrayList;
import java.util.Arrays;

public class GarbageCollection {

    public static void main(String[] args) {


        String str = "Wooden spoon";
        //1st way >>>> assigned null: empty nothing assigned, unreferenced object by assigning null keyword
        //after this line string object eligible for garbage collection
        //gets collected from heap and garbage collector collects it and destroyed
        //garbage collector calls finalise method and destroys the object: automatically
        str = null;
        System.out.println(str);

        //2nd way>> unreferencing object 2
        Dog dog1 = new Dog();
        dog1.name = "Lucy";
        System.out.println(dog1);


        String languge = "Phyton";
        languge = "java";
        System.out.println(languge);

        //1 .ci kapiyi 2.kapiya esitle
        //its not unreferenced so its not eligible to garbage collector
        ArrayList<Integer> list1= new ArrayList<>();
        list1.add(100);
        ArrayList<Integer> list2= list1;
        list2.addAll(Arrays.asList(200,300,400));
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list1==list2);






    }

}
