package day27_WrapperClasses;

public class Task4 {
    /*. Write program that returns true if the total number of upper case characters are
    equal to total number of Lowercase characters of a string

		Ex:
			str = "JAVA java";
		output:
			true
*/
    public static void main(String[] args) {

        String str = "JAVA java";
        int upperCase = 0;
        int lowerCase = 0;

        for (int each = 0; each < str.length(); each++) {
            char ch = str.charAt(each);

            if (Character.isUpperCase(ch)) {
                upperCase++;
            }
            if (Character.isLowerCase(ch)) {
                lowerCase++;
            }
        }
        boolean result = upperCase == lowerCase;
        System.out.println(result);
    }
}

