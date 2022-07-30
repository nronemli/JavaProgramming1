package day30_CustomClass;

import java.util.ArrayList;

public class StudentObject {
    public static void main(String[] args) {

        //OBJECT OF STUDENT CLASS
        Student student1 = new Student();
        student1.setInfo("Nur", 'F', 33, 12345, 'A');

        //OBJECT OF STUDENT CLASS
        Student student2 = new Student();
        student2.setInfo("Selim", 'M', 7, 2345, 'A');
   //     System.out.println(student2);

        Student student3 = new Student();
        student3.setInfo("Emin", 'M', 9, 3456, 'C');

        Student student4 = new Student();
        student4.setInfo("Necip", 'M', 36, 4567, 'D');

        Student student5 = new Student();
        student5.setInfo("Cydeo", 'F', 22, 6789, 'E');

        //all students are in the array list students
        Student[] students = {student1, student2, student3, student4, student5};

        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("************early birds**************");

        ArrayList<Student> earlyBirds= new ArrayList<>();
        ArrayList<Student> angryBirds= new ArrayList<>();

        for (Student eachStudent : students) {
            if(eachStudent.grade == 'A'){
                earlyBirds.add(eachStudent);
            }else {
                angryBirds.add(eachStudent);
            }
        }

        System.out.println(earlyBirds);
        System.out.println(angryBirds);



    }


}
