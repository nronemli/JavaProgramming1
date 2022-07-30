package day10_NestedIf;

public class CharacterIdentity {

    public static void main(String[] args) {

        char ch = 65; //ASCII TABLE REPRESENTATION

        if (ch >= '0' && ch <= 9) {
            System.out.println("Digit");
        } else if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            System.out.println("Alphabet");
        } else {
            System.out.println("Special Character");
        }
    }
}
