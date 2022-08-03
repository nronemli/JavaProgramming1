package day39_Recap.animalTask;

public class Cat extends FriendlyAnimal
{

    public Cat(String name, String breed, char gender, int age, String size, String color,
               boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, gender, age, size, color, isWild, isFriendly, isPlayable);
    }

    @Override
    public void eat() {
        System.out.println(getName() +" loves to eat cat food");
    }

    public void scrath(){
        System.out.println(getName()+ " "+getBreed() + " loves to scratch the sofas") ;
    }

    public void meow(){
        System.out.println(getName()+ " "+getBreed() + " loves to meow");
    }

}
