package utilities;

import day39_Recap.cydeoTask.day40_FinalKeyword.ProtectedAccessModifier;

public class AccessMod_Test4 extends ProtectedAccessModifier{
    public static void main(String[] args) {

        //name 2 visible when its a child class
        System.out.println(ProtectedAccessModifier.name2);

        //protected inherited to child class only
        AccessMod_Test4.method2();

    }
}
