package day31_Constructors.MyOfferTask;

import day31_Constructors.MyOfferTask.Developer;
import day31_Constructors.MyOfferTask.Tester;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

    public String PO, BA, SM;
    public int daysOfSprint;
    ArrayList<Tester> testersList = new ArrayList<>();
    ArrayList<Developer> developsList = new ArrayList<>();


    //add one tester to the array list
    public void addTester(Tester tester) {
        testersList.add(tester);
    }

    //add array of testers to the array list
    public void addTesters(Tester[] testers) {
        testersList.addAll(Arrays.asList(testers));
    }

    public void addDeveloper(Developer developer) {
        developsList.add(developer);
    }

    public void addDevelopers(Developer[] developers) {
        developsList.addAll(Arrays.asList(developers));
    }

    public void removeTester(int employeeID) {
        testersList.removeIf(p -> p.employeeID == employeeID);
    }

    public void removeDeveloper(int employeeID) {
        testersList.removeIf(p -> p.employeeID == employeeID);
    }

    public ScrumTeam(String PO, String BA, String SM, int daysOfSprint) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
        this.daysOfSprint = daysOfSprint;
    }

    public String toString() {
        return "ScrumTeam{" +
                "PO='" + PO + '\'' +
                ", BA='" + BA + '\'' +
                ", SM='" + SM + '\'' +
                ", total number of testers=" + testersList.size() +
                ", total number of developers" + developsList.size() +
                ", daysOfSprint=" + daysOfSprint +
                '}';
    }
}

