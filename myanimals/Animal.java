package myanimals;

import mystuff.Stuff;

public class Animal
{
    String species;
    String name = "animal";
    int age;
    String breed;

    protected static int numOfAnimals = 0;
    protected static int numOfAnimals()
    {
        return numOfAnimals;
    }
    //Constructor
    public Animal(int age){
        this.age = age;
        numOfAnimals++;
    }
    //Constructor
    public Animal(String species){
        this.species = species;
        numOfAnimals++;
    }
    //Constructors
    public Animal(){
        numOfAnimals++;
    }
    //Prints Description
    public static int profile(Animal animal)
    {
        System.out.println("===================");
        System.out.println("Name: " + animal.name);
        System.out.println("Species: " + animal.species);
        System.out.println("breed: " + animal.breed);
        System.out.println("age: " + animal.age);
        if(animal instanceof Cat)
        {
            ((Cat) animal).meow();
        }
        if(animal instanceof Dog)
        {
            ((Dog) animal).bark();
        }
        return 0;
    }

    public static void main(String [] args)
    {
        Animal bird = new Animal("bird");
        bird.name = "Sasha";
        bird.age = 3;
        bird.breed = "parrot";

        Cat cat1 = new Cat();
        cat1.name = "Artemas";
        cat1.age=5;
        cat1.breed = "maine coon";

        Dog dog1 = new Dog();
        dog1.name = "Cona";
        dog1.age = 4;
        dog1.breed = "labrador";

        profile(bird);
        profile(cat1);
        profile(dog1);

        int x = Animal.numOfAnimals();
        System.out.println("=================================");
        System.out.println("number of animals: "+ x);
    }


}

