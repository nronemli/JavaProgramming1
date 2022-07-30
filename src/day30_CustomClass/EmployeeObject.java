package day30_CustomClass;

public class EmployeeObject {
    public static void main(String[] args) {


        Employee emp1 = new Employee();
        emp1.setInfo("Nur Onemli", 'F', "SDET", 1234, 34000, true);
        Employee emp2 = new Employee();
        emp2.setInfo("John", 'M', "Developer", 2237, 10000, true);
        Employee emp3 = new Employee();
        emp3.setInfo("Anna", 'F', "QA", 2287, 8500, false);
        Employee emp4 = new Employee();
        emp4.setInfo("Lina", 'F', "Manager", 2294, 80000, true);
        Employee emp5 = new Employee();
        emp5.setInfo("Kevin",'M',"Senior QA",4534,11000,false);

        //store all employee objects into the array
        Employee[] employees= {emp1,emp2,emp3,emp4,emp5};

        int countFullTime=0;
        int countPartTime= 0 ;
        double max = employees[0].salary; //assign first employee to double max
        double min= employees[0].salary;
        for (Employee eachEmployee : employees) {
            if(eachEmployee.isFullTime ==true){
                countFullTime++;
            }else{
                countPartTime++;
            }
            if(eachEmployee.salary> max){
                max = eachEmployee.salary;
            }
            if(eachEmployee.salary<min){
                min = eachEmployee.salary;
            }

        }
        System.out.println("countPartTime = " + countPartTime);
        System.out.println("countFullTime = " + countFullTime);
        System.out.println("min = " + min);
        System.out.println("max = " + max);






    }
}
