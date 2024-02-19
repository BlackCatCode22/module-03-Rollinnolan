package myanimals;

class Dog extends Animal {
    //Constructor
    public Dog(String name){
        super(name);
        this.species = "dog";
    }
    //Constructor
    public Dog(int age){
        super(age);
        this.species = "dog";
    }
    //Constructor
    public Dog(){
        this.species = "dog";
    }
    //Dog method
    public void bark(){
        System.out.println(this.name + " says "+ "Bark!");
    }
}
