package day36_Inheritance.scrumTask;

public class ProductOwner extends Employee{

    public ProductOwner(String name, int age, char gender, int id, double salary, String companyName) {
        super(name, age, gender, id,"PO", salary, companyName);
    }

    public void productName(){
        System.out.println("Amazon");
    }

}

/*
6. Create a sub class of EMployee named ProductOwner:
Add any extra variable or method that ProductOwner object need to ha
 */