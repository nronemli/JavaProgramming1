package day36_Inheritance.scrumTask;

public class ScrumMaster extends Employee{



    public ScrumMaster(String name, int age, char gender, int id, double salary, String companyName) {
        super(name, age, gender, id, "Scrum Master", salary, companyName);
    }


    public void meeting(String meetingDate, String meetingTime){
        System.out.println(name+" is having a meeting " +meetingDate+ " on "+meetingTime);
    }







}

/*
7. Create a sub class of EMployee named ScrumMaster:

	Add any extra variable or method that ScrumMaster object need to have


 */