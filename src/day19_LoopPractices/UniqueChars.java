package day19_LoopPractices;

public class UniqueChars {

    public static void main(String[] args) {

        String str = "aabccdeef";
        String result = "";

        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            int count = 0; //represents the frequency of the variable

            for (int i = 0; i < str.length(); i++) { //
                char each = str.charAt(i);//each character in the string
                if (ch == each) {
                    count++;
                }
            }
            if (count == 1) { //if the frequency of the character is1, then its unique
                result += ch;//add characters to string
            }
            /* //if its not unique
            if(count !=1){
                result+=ch;
            }
            */
        }
        System.out.println(result);
    }
}
