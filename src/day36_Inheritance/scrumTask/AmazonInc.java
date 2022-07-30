package day36_Inheritance.scrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class AmazonInc {
    public static void main(String[] args) {


        String company = "Amazon Inc";
        //create the objects of ProductOwner, ScrumMaster, and BusinessAnalyst

        ProductOwner p1 = new ProductOwner("Nur", 33, 'F', 12434, 95000, company);
        BusinessAnalyst b1 = new BusinessAnalyst("Selim", 6, 'F', 12434, 25000, company);
        ScrumMaster s1 = new ScrumMaster("Emin", 10, 'M', 12434, 35000, company);

        Tester t1 = new Tester("Nese", 38, 'F', 3664, "SDET",45000,company);
        Tester t2 = new Tester("Necip", 37, 'M', 8634,"QA", 75000, company);

        Tester[] testers= {t1,t2};

        Developer d1=  new Developer("Mike", 40, 'M', 1254, "SQL",5000,company);
        Developer d2= new Developer("Jack", 38, 'M', 1634, "Java",65000,company);

        Developer[] developers={d1,d2};

        ScrumTeam scrumTeam=new ScrumTeam(p1,b1,s1); //add all the po, bo, so to scrumteam
        scrumTeam.addDeveloper(d1); //add d1 developer to scrum team
        scrumTeam.addTester(t1); //add the t1 tester to scrum team
        System.out.println(scrumTeam);  // should be 1 tester 1 dev
        scrumTeam.addTesters(testers); // added both t1 and t2 array of testers
        scrumTeam.addDeveloper(developers); //added both d1 , d2 array of developers
        System.out.println(scrumTeam); //should ve 3 tester 3 dev

        System.out.println("++++++++Tester name and salary+++++++");
        for (Tester eachTester : scrumTeam.testers) { //each tester in the scrum team testers
            System.out.println(eachTester.name + " " + eachTester.salary); //t1 and t2 name and salary
        }

        System.out.println("++++++developers++++++++++++++++ ");
        for (Developer eachDeveloper : scrumTeam.developers) {
            System.out.println(eachDeveloper);
        }




    }

}

/*
9. Create a class named AmazonInc:


			Create 4 objects of Testers
			Create 5 Objects of Developers

			Create an object of ScrumTeam

			Add the ProductOwner, ScrumMaster, and BusinessAnalyst, Testers and Developers object into the scrum team


 */