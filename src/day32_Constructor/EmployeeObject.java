package day32_Constructor;

public class EmployeeObject {
    public static void main(String[] args) {

        //employee object : name set only
        Employee emp1 = new Employee("Nur");
        System.out.println(emp1);

        Employee emp2 = new Employee("Nur", 'F');
        System.out.println(emp2);

        Employee emp3 = new Employee("nur", 'F', "SDET");
        System.out.println(emp3);

    }
}

