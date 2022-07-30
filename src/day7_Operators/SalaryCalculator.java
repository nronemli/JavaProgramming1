package day7_Operators;

public class SalaryCalculator {
    public static void main(String[] args) {

        int hourlyRate = 60, weeklyHours = 40, stateTaxRate = 8, federalTaxRate = 18;

        double salaryBeforeTax = hourlyRate * weeklyHours * 52;
        double stateTax = salaryBeforeTax * (stateTaxRate / 100.0);
        double federalTax = salaryBeforeTax * (federalTaxRate / 100.0);
        double totalTax = stateTax + federalTax;
        double salaryAfterTax = salaryBeforeTax - totalTax;

        System.out.println("hourlyRate = " + hourlyRate);
        System.out.println("weeklyHours = " + weeklyHours);
        System.out.println("stateTaxRate = " + stateTaxRate);
        System.out.println("federalTaxRate = " + federalTaxRate);
        System.out.println("Gross pay is: $" + salaryBeforeTax);
        System.out.println("Federal tax is: $" + federalTax);
        System.out.println("State tax is: $" + stateTax);
        System.out.println("Total tax is: $" + totalTax);
        System.out.println("Net income is: $" + salaryAfterTax);


    }


}
