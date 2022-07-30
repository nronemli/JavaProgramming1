package day34_GarbageCollection_AccessModifiers;

public class AccessModifiers {

    //public method
    public static void method1(){
        System.out.println("Public");
    }

    //default method
    static void method2(){
        System.out.println("Default");
    }
    //private method
    private static void method3(){
        System.out.println("Private");
    }


    public static int publicData = 100;
    static int defaultData = 200;
    private static int privatedata = 300;

    public static void main(String[] args) {

        System.out.println(publicData);
        System.out.println(privatedata);
        System.out.println(defaultData);




        }


    }
