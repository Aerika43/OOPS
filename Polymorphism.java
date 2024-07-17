package Opps;
class Animal
{
    public void animalSound()
    {
        
        System.out.println("The Animal makes a Sound");
    }
}
class Cat extends Animal
{
    public void animalSound()
    {
        
        System.out.println("The Cat says : Meow Meow");
    }
}
class Dog extends Animal
{
public void animalSound()
    {
        
        System.out.println("The Dog says : Bow Wow");
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Cat myCat = new Cat();
        Dog myDog = new Dog();
        
        myAnimal.animalSound();
        myCat.animalSound();
        myDog.animalSound();
    }
}
