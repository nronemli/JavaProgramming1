package day47_OOP_polymoprhism;

import day43_Abstraction.Employee.Employee;
import day43_Abstraction.Employee.Tester;
import day44_Abstraction.AnimalTask.Animal;
import day44_Abstraction.AnimalTask.Cat;
import day44_Abstraction.AnimalTask.Dog;
import day45_Abstraction.Circle;
import day45_Abstraction.Shape;
import day45_Abstraction.Square;

public class ReferenceTypeCasting {

    public static void main(String[] args) {

        //POLYMORPHSM = PARENT BEING REFERENCED TO CHILD OBJECT
        //UPCASTING
        //shape is the super type = child class is Circle ,object created.
        Shape shape = new Circle(4); //upcasting done implicitly
        //is a relationship between shape and circle

        //shape shape = (Shape) new Circle(5);
        Shape shape2 = new Circle(5);
        //smaller to larger = automatically by the compiler
        //no need to worry about upcasting


        //DOWNCASTING
        Animal animal = new Dog("Panda", "Felix", 'F', 2, "medium", "black white");
        //downcasting with dog variable reference type to be able to reuse and call again if not do example2
        Dog dog = (Dog) animal; //one dog object with two reference name, 1 animal ,2nd dog. //downcasting
        System.out.println(animal.getName()); //panda
        System.out.println(dog.getName()); //panda
        dog.bark(); //panda is barking
        //downcasting example2
        ((Dog) animal).bark();
        //shortcut downcasting

        Shape shape1 = new Square(5);
        //downcasting
        System.out.println(((Square)shape1).getSide());

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        Animal animal2 = new Cat("Panda", "Felix", 'F', 2, "medium", "black white");

        ((Cat) animal2).meow(); //downcasting

        System.out.println("______________________________");

        Employee employee= new Tester("Nur",33,'F',1234,"SDET",345000);

        ((Tester) employee).bugReport();
        ((Tester) employee).sleep();
        //There has to be a IS-A relationship between

    }

}
