package day04_Variables;

public class SalaryCalculator {
    public static void main(String[] args) {

        // hourlyRate = 50
        int hourlyRate = 50;
        // weeklyHours = 40
        int weeklyHours = 40;
        int numberOfWeeks = 52;
        int salary = hourlyRate * weeklyHours * numberOfWeeks;
        //system.out.println(salary) dont include any " "
        //no need for " " between the brackets, otherwise it will not work
        System.out.println("Hourly Rate = $" +hourlyRate);
        System.out.println("Weekly Hours ="+ weeklyHours);
        System.out.println("Number of weeks ="+numberOfWeeks);
        System.out.println("Salary = $"+salary);
    }


}
