package day44_Abstraction.AnimalTask;


import day45_Abstraction.Circle;
import day45_Abstraction.Volume;

//interface cannot be a parent class
//it can be a parent to other interface
public interface WildAnimal {
    boolean isWild = true; //static and final by default
    void hunt(); //abstract by default
}
