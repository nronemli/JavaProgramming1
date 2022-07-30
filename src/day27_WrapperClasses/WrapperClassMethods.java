package day27_WrapperClasses;

public class WrapperClassMethods {
    public static void main(String[] args) {
        //PARSE METHOD ----> use to convert string to primivite

        String str = "1234"; //string that can be converted to a number
        //primitive     primitive
        int num = Integer.parseInt(str); //returns int

        System.out.println(num + 1);  //1235
        System.out.println(str + 1); //12341

        String str2 = "10.5";

        //primitive     primitive
        double num2 = Double.parseDouble(str2);
        System.out.println(num2 + 1); //11.5

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        long max2 = Long.MAX_VALUE;
        long min2 = Long.MIN_VALUE;

        System.out.println(max);
        System.out.println(min);

        System.out.println(max2);
        System.out.println(min2);

        String s1 = "true";
        boolean r1 = Boolean.parseBoolean(s1);
        System.out.println(r1);
        String s2 = "";
        boolean r2 = Boolean.parseBoolean(s2);
        System.out.println(r1);
        System.out.println("************************");

        String s4 = "123";
        Integer x = Integer.valueOf(s4); //Integer
        int y = Integer.valueOf(s4);// Integer

        System.out.println(x);
        System.out.println(y);

        String s3 = "1.5";
        Double z = Double.valueOf(s3);// Double

        System.out.println(z);

        System.out.println("-----------------------------------------------------");


        char ch1 = '!';

        //isDigit()
        boolean r7 = Character.isDigit(ch1);

        //isLetter()
        boolean r3 = Character.isLetter(ch1);

        // special char
        boolean r4= !Character.isLetterOrDigit(ch1);

        // upperCase
        boolean r5 = Character.isUpperCase(ch1);

        //lowerCase
        boolean r6 = Character.isLowerCase(ch1);

        System.out.println(r7);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);
        System.out.println(r6);

        System.out.println("----------------------------------");

        String s = "ab1cde2efg3hi4";

        int sum = 0;

        for (char each : s.toCharArray()) {

            if( Character.isDigit(each) ){
                sum +=  Integer.parseInt(""+each);
            }

        }

        System.out.println("sum = " + sum);



    }


}
