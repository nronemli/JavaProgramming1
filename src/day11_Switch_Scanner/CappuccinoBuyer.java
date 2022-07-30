package day11_Switch_Scanner;

public class CappuccinoBuyer {
    public static void main(String[] args) {

        String size = "Tall";
        String result = "";
        boolean sizeChoice = size == "Tall" || size == "Grande" || size == "Venti";

        if (sizeChoice) {
            switch (size) {
                case "Tall":
                    result = "price is £3.69 \n90 calories";
                    break;
                case "Grande":
                    result = "price is £3.99 \n120 calories";
                    break;
                case "Venti":
                    result = "price is £4.29 \n150 calories";
                    break;

                default:
                    result = "Invalid Size";
            }
            System.out.println(result);
        }


    }
}






