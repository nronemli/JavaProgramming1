package day39_Recap.cydeoTask;

public class Cydeo {
    public static void main(String[] args) {

        Tester t1 = new Tester("Nur", 34, 'F', 12345, 65000);
        Developer d1 = new Developer("Selim", 38, 'M', 3456, 76000);
        Student s1 = new Student("Emin", 18, 'M', 4567, "Maths");
        Teacher teacher1 = new Teacher("Necip", 40, 'M', 125454, 45000);
        System.out.println(d1);
        System.out.println(t1);
        System.out.println(s1);
        System.out.println(teacher1);

        System.out.println(t1.getName());
        t1.createTicket();
        d1.fixingBugs();
        d1.work();
        System.out.println(d1.getSalary());

        s1.getGender();
        s1.setFieldOfStudy("Sports");

        teacher1.work();
        teacher1.eat();
        t1.drink();
        d1.sleep();
        s1.study();


    }
}

/*
    7. Create a class named Cydeo:
            create objects of Tester, Developer,Teacher, Student

            test all the functions of each objects

            Analyze the relationships between the classes
 */