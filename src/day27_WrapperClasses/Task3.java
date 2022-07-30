package day27_WrapperClasses;

public class Task3 {


    /*3. Write a program that can retrieve the letters,
    digits and special characters from the string

		Ex:
			str = "Wooden Spoon!"

		output:
			letters= "WoodenSpoon";
			Digits = "";
			specialChars = " !";*/
    public static void main(String[] args) {
        String str = "Wooden Spoon2022!!!";
        String letters = "";
        String digits = "";
        String specialChars = "";

        for (int each = 0; each < str.length(); each++) {
            char ch = str.charAt(each);

            if (Character.isLetter(ch)) {
                letters += ch;
            } else if (Character.isDigit(ch)) {
                digits += ch;
            } else {
                specialChars += ch;
            }
        }
        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specialChars = " + specialChars);
    }

}
