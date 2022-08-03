package day39_Recap.animalTask;

public class Dog extends FriendlyAnimal{

    public Dog(String name, String breed, char gender, int age, String size, String color,
               boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, gender, age, size, color, isWild, isFriendly, isPlayable);
    }


    public void bark(){
        System.out.println(getName()+ " "+ getBreed()+ " is barking");
    }

    @Override
    public void eat() {
        System.out.println(getName() +" loves to eat dog food");
    }
}
