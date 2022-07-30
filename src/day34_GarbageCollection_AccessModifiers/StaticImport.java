package day34_GarbageCollection_AccessModifiers;

//importing static methods to use the methods below
import static day34_GarbageCollection_AccessModifiers.Circle.*;
import static utilities.MathUtility.*;


public class StaticImport {
    public static void main(String[] args) {

        //static import on top page allows us to use static members
        System.out.println(pi);

        System.out.println("_________________________");
        //because we imported from math utility above we can use it to call directly
        //find sum of 10-20
        int r1 = sum(10, 20);
        System.out.println(r1);

        int r2 = subtraction(20, 5);
        System.out.println(r2);

    }
}
