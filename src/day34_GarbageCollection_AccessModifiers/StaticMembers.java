package day34_GarbageCollection_AccessModifiers;


public class StaticMembers {

    //static only accepts static members
    //default access modifier
    //inner class 1
    static class class1 {

    }

    //static variables
    public static int num = 100;

    //static methods
    public static void method() {

    }

    //static block
    static {
    }

/*
    //nested class ,MAIN CLASS CANT BE STATIC BUT B CLASS CAN .
    class A { //outer class
        static class B { //inner class
            public static void method1() {

            }
        }
    }

    class C {
        public static <String> void main(String[] args) {
            A.B.method1();
        }
    }
/*
INTERVIEW QUESTION: CAN A CLASS BE STATIC? Yes, only if its a nested class, the inner class can be
static not the outer class.
 */

}
