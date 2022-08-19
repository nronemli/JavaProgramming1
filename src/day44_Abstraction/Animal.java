package day44_Abstraction;

public abstract class Animal {

    /*

     */
    private String name;
    private final String breed;
    private final char gender;
    private int age;
    private String size;
    private final String color;

    //static: one copy
//final: unchangeable
    public final static boolean canBreath = true;


    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        if(name.isEmpty()){
            throw new RuntimeException("Invalid Name");
        }
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSize(String size) {
        this.size = size;
    }


    public Animal(String name, String breed, char gender, int age, String size, String color) {
        setName(name);
        this.breed = breed;
        if (!(gender == 'M' || gender == 'F')) {
            throw new RuntimeException("Invalid gender" + gender);
        }
        this.gender = gender;
        setAge(age);
        setSize(size);
        this.color = color;
    }
}





/*
Animal Task:
		Create an abstract class named Animal:
			Variables:
				name, breed(final), gender(final),  age, size, color(final)

			Encapsulate all the fields

			Add a cosntructor that can set all the fields

			Methods:
				eat(); ==> different animals eat different foods
				drink() ==> all the animals drink water
				toString() ==> to display the full info of the animal

		Create the following subclasses of Animal:
				Dog
					eat(): eats Pizza

				Cat
					eat(): eats Biryani

				Tiger
					eat(): eats deer

				Parrot
					eat(): eats chocolate

				Eagle
					eat(): eats snake

 */
