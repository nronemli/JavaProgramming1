package day39_Recap.animalTask;

public class Zoo {

    public static void main(String[] args) {

        Cat cat1= new Cat("Panda","Felix",'F',2,"medium","Black and white",
                false,true,true);

        Dog dog1= new Dog("Pasa","Kangal",'M',4,"Large","beige",
                true,false,true);

        Dolphin dolphin= new Dolphin("Al","bottlenose dolphin",'M',5,"Large",
                "white",true,false,false);

        Parrot parrot= new Parrot("Fistik","Afrigan grey",'F',2,"small",
                "grey",true,true,true);

        System.out.println(cat1);
        System.out.println(dog1);
        System.out.println(dolphin);
        System.out.println(parrot);

        System.out.println(cat1.getName());
        System.out.println(dog1.getBreed());
        System.out.println(parrot.getSize());
        System.out.println(dolphin.isPlayable());

        cat1.setColor("black");
        cat1.meow();
        dog1.drink();
        dog1.play();
        parrot.setColor("green");
        System.out.println(parrot);

        Tiger tiger=new Tiger("Bob","Siberian",'F',10,"Large","Mix",
                true,false,false);
        Lion lion= new Lion("Leo","African lion",'M',15,"Large","Mix",
                true,false,false);
        Eagle eagle= new Eagle("Golden","Bold eagle",'M',4,"Medium","Brown",
                true,false,false);
        Bear bear = new Bear("Bear","American black",'F',9,"Large","black",
                true,false,false);

        tiger.hunt();
        tiger.drink();
        System.out.println(tiger.getAge());


        lion.hunt();
        lion.move();
        System.out.println(lion.getColor());

        eagle.hunt();
        System.out.println(eagle.getColor());

        bear.hunt();
        bear.eat();
        bear.isWild();
        System.out.println(bear);


    }
}
