package day33_Statics.cydeoStudentTask;

public class TestStudent {
    public static void main(String[] args) {

        CydeoStudent student1 = new CydeoStudent("Nur", 10, 'F', 23434343, 'A',
                9, 22);

        student1.attendClass();
        student1.study();
        student1.printSchoolName();
        student1.printSchoolName();
    }
}
