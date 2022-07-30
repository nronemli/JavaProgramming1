package day34_GarbageCollection_AccessModifiers;

public class StaticBlock {

    //Before java8 , static block can be runnable, after that it cant be runnable
    //without the main method

    public static void main(String[] args) {

        System.out.println("Main method");
    }
    //first thing gets executed is static block in java,
    // RUNS ONCE ONLY, then main method
    //use to initialise STATIC VARIABLES
    //you cannot call it
    //known as static initialization block
    static {
        System.out.println("Static block");
    }

    static {
        System.out.println("Static block2");
    }

    static {
        System.out.println("Static block3");
    }


}
