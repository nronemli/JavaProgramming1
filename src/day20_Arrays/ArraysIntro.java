package day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {

        //single dimensional array

        String myGroup[] = new String[5];//can also be String [] myGroup = new String[5];
        myGroup[0] = "Aynur"; //index number starts from 0
        myGroup[1] = "Necip";
        myGroup[2] = "Emin";
        myGroup[3] = "Selim";
        myGroup[4] = "Onemli";
        System.out.println(Arrays.toString(myGroup)); //Arrays.toString (name of variable)

        System.out.println("---------------------------");

        String[] days =
                {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        //index 0       1           2           3           4           5       6
        System.out.println(Arrays.toString(days));

        int number = 5;

        if (number < 1 || number > 7) {
            System.err.println("Invalid number");
            System.exit(0);
        }

        System.out.println(days[number - 1]); //-1 because index 5 is Saturday , we need Friday so -1


    }
}
