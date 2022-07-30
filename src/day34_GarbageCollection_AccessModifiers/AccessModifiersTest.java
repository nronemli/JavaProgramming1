package day34_GarbageCollection_AccessModifiers;

public class AccessModifiersTest {

    public static void main(String[] args) {
        System.out.println(AccessModifiers.publicData);
        System.out.println(AccessModifiers.defaultData);

        //private is not visible outside its class
        //System.out.println(AccessModifiers.privateData);

        AccessModifiers.method1(); //public method
        AccessModifiers.method2(); //default method
        //AccessModifiers.method3(); // private: only visible within its class



    }


}
