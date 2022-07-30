package day10_NestedIf;

public class AgeGroups {
    public static void main(String[] args) {

        int age = 33;
        boolean validAge = (age > 0 && age < 150);
        String result = "";

        if (validAge) {
            if (age < 21) {
                result = "Teenager";
            } else if (age >= 21 && age <= 55) {
                result = "Adult";
            } else {
                result = "Senior";
            }

        } else {
            result = "Invalid";
        }
        System.out.println(result);

    }


}
