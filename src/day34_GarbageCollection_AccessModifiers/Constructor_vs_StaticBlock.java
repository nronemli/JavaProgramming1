package day34_GarbageCollection_AccessModifiers;

public class Constructor_vs_StaticBlock {
    //static block: used for initialising static variables
    //static gets executed first all the time
    static {
        System.out.println("Static block");
    }
    //constructor: runs multiple times
    public Constructor_vs_StaticBlock() {
        System.out.println("Constructor");
    }

    //static will be printed first, thain main method , x5 object constructor
    public static void main(String[] args) {
        System.out.println("Main method");
        new Constructor_vs_StaticBlock(); //1
        new Constructor_vs_StaticBlock(); //2
        new Constructor_vs_StaticBlock(); //3
        new Constructor_vs_StaticBlock(); //4
        new Constructor_vs_StaticBlock(); //5
    }


}
