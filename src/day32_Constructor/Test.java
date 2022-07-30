package day32_Constructor;

public class Test {

    public Test() {
        System.out.println("A");
    }

    //second constructor calling the first constructor
    public Test(int a) { //A B
        this(); //A
        System.out.println("B");
    }

    public Test(double a) {
        this(10);  //A B
        System.out.println("C"); //A B C
    }

    public Test(String str) { // A B C D
        this(10.0); //A B C
        System.out.println("D"); //A B C D
    }




}
