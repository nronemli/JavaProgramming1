package Day46_Polymorphysim;

import day45_Abstraction.Circle;
import day45_Abstraction.Square;

import java.util.Arrays;

public class PolymorphysimIntro {
    public static void main(String[] args) {

        String str = "Wooden spoon";
        Integer n1 = 2;
        Double b2 = 5.5;
        Boolean r1 = true;

        //object is the parent of ALL THE CLASSES
        Object[] array= {str, n1, b2,r1, new Circle(4), new Square(7)};
        System.out.println(Arrays.asList(array));
    }
}
