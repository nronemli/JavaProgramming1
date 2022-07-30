package day10_NestedIf;

public class CrewAndPassengers {
    public static void main(String[] args) {

        int number = 75;
        String crewPass = "";

        if (number >= 50 && number <= 100) {
            if (number == 50) {
                crewPass = "20 crew, 30 passengers";
            } else if (number == 75) {
                crewPass = "25 crew, 30 passengers";
            } else {
                crewPass = "30 crew, 70 passengers";
            }
        } else {
            System.out.println("Invalid Number");
        }
        System.out.println("Total: " +number+ "  ====> " +crewPass);

    }


}
