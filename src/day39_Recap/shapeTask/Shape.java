package day39_Recap.shapeTask;

public class Shape {

    private String name;


    //getters and setters  : read and write the private instance variable
    public String getName() {
        return name;
    }

    // "" > is still object null = is empty
    public void setName(String name) {
        if (name == null) {
            System.err.println("Name cannot be null");
            System.exit(1); //1 : something went wrong
        }
        if (name.isBlank() || name.isEmpty()) {
            System.err.println("Invalid name");
            System.exit(1);
        }
        this.name = name;
    }

    public Shape(String name) {
       setName(name);
    }

    public double area() {
    return 0;
    }

    public double perimeter() {
        return 0;
    }

    //Override annotation is not mandatory
    @Override
    public String toString() {
        return "Shape {" +
                "name='" + name + '\'' +
                ",area='" + area() +'\'' +
                ",perimeter='" + perimeter() +'\'' +
                '}';
    }

}

/*
Shape:
	variables:
	name
	Encapsulate the field

	Add a constructor to set the filed
	Methods:
		area(){}
		perimeter(){}



 */