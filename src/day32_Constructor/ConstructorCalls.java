package day32_Constructor;

public class ConstructorCalls {

    public ConstructorCalls() {
        System.out.println("Default constructor");
    }

    //constructor call has to be at the first step :line11
    public ConstructorCalls(int a) {
        this();
        System.out.println("Constructor with int argument");
    }

    public ConstructorCalls(String str) {
        this(10);


    }

    public static void main(String[] args) {

        ConstructorCalls obj1 = new ConstructorCalls();
        System.out.println("_____________________");
        ConstructorCalls obj2= new ConstructorCalls(10);
        System.out.println();

    }

}
