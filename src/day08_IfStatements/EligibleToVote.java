package day08_IfStatements;

public class EligibleToVote {
    public static void main(String[] args) {

        String name = "Josh";

        int age = 38;
        String citizen = "USA";
        boolean eligible = age >= 21 && citizen == "USA";


        //eligible
        if (eligible) {
            System.out.println("Eligible");
        }

        //not eligible
        if (!eligible) {
            System.out.println("Not Eligible");
        }


    }


}
