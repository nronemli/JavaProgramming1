package day33_Statics;

public class EmployeeObjects {
    public static void main(String[] args) {


        Employee emp1 = new Employee();
        emp1.name = "asa";
        emp1.salary = 10000;
        Employee emp2 = new Employee();
        emp2.name = "asadasd";
        emp1.salary = 102000;

        Employee emp3 = new Employee();
        emp3.name = "adsasdas";
        emp1.salary = 101000;

        System.out.println(emp1.name + " " + emp1.salary);
        System.out.println(emp2.name + " " + emp1.salary);
        System.out.println(emp3.name + " " + emp1.salary);


    }
}
