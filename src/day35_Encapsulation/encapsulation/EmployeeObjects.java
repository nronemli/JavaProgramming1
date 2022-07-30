package day35_Encapsulation.encapsulation;

public class EmployeeObjects {
    public static void main(String[] args) {

        Employee emp1 = new Employee("", 'I', -8, 20000);

        System.out.println(emp1);

        emp1.setAge(33);
        emp1.setGender('M');
        emp1.setName("Emin");
        System.out.println(emp1);


        Employee emp2 = new Employee("Aygun", 'F', 45, 45000);
        System.out.println(emp2);

        emp2.setSalary(emp2.getSalary()+15000);
        System.out.println(emp2);
        emp2.setName("Nur");
        System.out.println(emp2.getName());




    }
}
