package day10_NestedIf;

public class Loans {
    public static void main(String[] args) {

        double salary = 70.000;
        int creditScore = 700;

        String result = (salary >= 60.000) && (creditScore >= 650) ? "Loan Approved" + "\n" + "Salary: above 60.000"
                + "\n" + "Credit Score: above 650" : "Loan Denied";

        System.out.println(result);


    }


}
