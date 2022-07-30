package day20_Arrays;

public class UniqueElements {
    public static void main(String[] args) {


        String[] word = {"Aynur", "Aynur","Selim"};


        for (int i = 0; i < word.length; i++) {//find out frequency of each element

            String element = word[i];
            int frequency = 0;
            for (int i1 = 0; i1 < word.length; i1++) { //finds frequency
                if (word[i].equals(element)) { //the element needs to be compared with each word
                    frequency++; //increase frequency
                }
            }

            if (frequency == 1) {
                System.out.println(element);
            }
        }
    }
}
