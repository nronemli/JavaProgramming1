package day36_Inheritance.scrumTask;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class ScrumTeam {

    public ProductOwner PO;
    public BusinessAnalyst BO;
    public ScrumMaster SM;
    public ArrayList<Tester> testers = new ArrayList<>();
    public ArrayList<Developer> developers = new ArrayList<>();

    public ScrumTeam(ProductOwner PO, BusinessAnalyst BO, ScrumMaster SM) {
        this.PO = PO;
        this.BO = BO;
        this.SM = SM;
    }

    //addTester(Tester tester): adds the given tester to testers arraylist
    public void addTester(Tester tester) {
        testers.add( tester );
    }

    //addTesters(Tester[] testers): adds the given testers to testers arraylist
    public void addTesters(Tester[] testers) {
        this.testers.addAll(Arrays.asList(testers));
    }

    //removeTester(int id): removes the tester with the given id from the arraylist of tester
    public void removeTester(int id) {
        testers.removeIf(p-> p.id == id);
    }

    //addDeveloper(Developer developer): adds the given developer to testers arraylist
    public void addDeveloper(Developer developer) {
        developers.add(developer);
    }

    //addDeveloper(Developer[] developer): adds the given developers to testers arraylist
    public void addDeveloper(Developer[] developer){
        this.developers.addAll(Arrays.asList(developer));
    }

   // removeDeveloper(int id): removes the developer with the given id from the arraylist of developer
    public void removeDeveloper(int id){
        developers.removeIf(p-> p.id == id);
    }

    public String toString() {
        return "ScrumTeam{" +
                "PO=" + PO.name +
                ", BO=" + BO.name +
                ", SM=" + SM.name +
                ", number of testers=" + testers.size() +
                ", developers=" + developers.size() +
                '}';
    }
}


/*
8. Creat a class named ScrumTeam:
			Variables:
				PO (ProductOwner), BA (BusinessAnalyst), SM (ScrumMaster),
				testers (ArrayList<Testers>),  developers (ArrayList<Developers>)

			Methods:

				toString(): displays the BA' name, SM' name, PO' name, number of testers
				and number of developers

 */