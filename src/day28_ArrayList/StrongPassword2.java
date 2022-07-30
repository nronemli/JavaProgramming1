package day28_ArrayList;


public class StrongPassword2 {
    public static void main(String[] args) {

        String password = "cLdeo1990!";

        int countUpper = 0;
        int countLower = 0;
        int digit = 0;
        int specialChars = 0;

        for (int each = 0; each < password.length(); each++) {
            char ch = password.charAt(each);
            if (Character.isDigit(ch)) {
                digit++;
            } else if (Character.isLowerCase(ch)) {
                countLower++;
            } else if (Character.isUpperCase(ch)) {
                countUpper++;
            } else {
                specialChars++;
            }
        }
        System.out.println("countLower = " + countLower);
        System.out.println("countUpper = " + countUpper);
        System.out.println("digit = " + digit);
        System.out.println("specialChars = " + specialChars);

        boolean isUpperCase = countUpper > 0;
        boolean isLowerCase = countLower > 0;
        boolean isDigit = digit > 0;
        boolean isSpecialChar = specialChars > 0;

        boolean strongPassword = password.length() >= 8 || !password.contains("")
                && isUpperCase && isLowerCase && isDigit && isSpecialChar;

        System.out.println(strongPassword);


    }


}

