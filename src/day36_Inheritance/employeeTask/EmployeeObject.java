package day36_Inheritance.employeeTask;

public class EmployeeObject {
    public static void main(String[] args) {

        Employee emp1= new Employee();
        emp1.setInfo("Selim",'M',6,12345,"QA",10000);
        emp1.work();

        Tester tester1= new Tester();
        tester1.setInfo("Emin",'M',10,2345,"SDET",15000);
        tester1.testing();
        tester1.creatingTicket();

        Teacher teacher1= new Teacher();
        teacher1.setInfo("Nur",'F',34,4567,"Teacher",34000);
        teacher1.work();
        teacher1.teaching();

        Developer dev1= new Developer();
        dev1.setInfo("Jack",'M',37,42464,"Developer",56000);
        dev1.work();
        dev1.fixingBugs();

        Driver driver1= new Driver();
        driver1.setInfo("Cydeo",'M',60,32534,"Driver",45000);
        driver1.driving();
        driver1.work();
    }
}
