import java.util.Arrays;

public class MergingTwoArrays {
    public static void main(String[] args) {


        String []group1= {"Java","Phyton","HTML","SQL","C++"};
        String []group2= {"Aynur","Emin","Selim","Necip"};

        //third array has the length of first array and second array to contain the elements
        String []students= new String[group1.length+ group2.length];


        int i = 0;
        for (String each : group1) {
            students[i++] = each;
        }

        for (String each: group2) {
            students[i++] = each;
        }

        System.out.println(Arrays.toString(students));



    }
}
