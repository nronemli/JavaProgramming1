package day09_IfElseStatements;

public class FieldTrip {

    public static void main(String[] args) {
        int grade = 1;
        String location = "";
        int numOfGroups = 0;
        String teacherInCharge = "";

        if (grade >= 1 && grade <= 6) {

            if (grade == 1) {
                location = "Apple Orchard";
                numOfGroups = 3;
                teacherInCharge = "Ms.Smith";
            } else if (grade == 2) {
                location = "Zoo";
                numOfGroups = 7;
                teacherInCharge = "Mr.Lee";
            } else if (grade == 3) {
                location = "Aquarium";
                numOfGroups = 5;
                teacherInCharge = "Ms.Wilson";
            } else if (grade == 4) {
                location = "Movie theater";
                numOfGroups = 2;
                teacherInCharge = "Ms.Reyes";
            } else if (grade == 5) {
                location = "Museum";
                numOfGroups = 5;
                teacherInCharge = "Ms.Lela";
            } else {
                location = "Six Flags";
                numOfGroups = 8;
                teacherInCharge = "Mr.Watt";
            }
        } else {
            System.out.println("Invalid grade");
        }
        System.out.println(location +"\n"+ numOfGroups +"\n" + teacherInCharge);
    }

}
