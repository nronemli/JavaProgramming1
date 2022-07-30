package utilities;

import day34_GarbageCollection_AccessModifiers.AccessModifiers;

public class AccessMod_Test2 {

    public static void main(String[] args) {

        //public can be accessed any time that is public, outside package
        System.out.println(AccessModifiers.publicData);

        //default access modifiers , not visible outside package, nor private
        //System.out.println(AccessModifiers.defaultData);

        AccessModifiers.method1(); //public is visible everywhere
       //AccessModifiers.method2(); //default and private cannot be called from another package




    }
}
