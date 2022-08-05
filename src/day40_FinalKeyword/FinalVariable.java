package day40_FinalKeyword;


/*
Final Keyword: unchangable
		Variables: can not be reassigned
		Methods: can not be overridden
		Classes: can not be inherited (can not be parent)
 */
public class FinalVariable {

    final String birthDay;
    static String name;

    static{
        name= "Nur";
    }

    public FinalVariable(String birthDay) {
        this.birthDay = birthDay;
    }

    public static void main(String[] args) {

        //local variable
        //to restrict user to change value
        final double pi = 3.14;

        final String name;
        name = "Java";
        System.out.println(name);
        //name= "Wooden spoon"; // cannot be re asigned after java because its final

        final char gender;

        FinalVariable obj= new FinalVariable("26/06/1989");
        System.out.println(obj.birthDay);

        System.out.println(FinalVariable.name);


    }


}
