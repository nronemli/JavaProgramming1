package day41_Exceptions;

public class Test {

    public Test() {
        System.out.println("A");
    }
    public Test(int a) {
        this(); //A
        System.out.println("B");
    }

    public Test(String str){
        this(); //A
       // this(100);
        System.out.println(str);
    }



    public static void main(String[] args) {

        Test obj = new Test();



    }

}
