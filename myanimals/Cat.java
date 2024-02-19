package myanimals;
    public class Cat extends Animal
    {
        //Constructor
        public Cat(String name){
            super(name);
            this.species = "cat";
        }
        //Constructor
        public Cat(int age){
            super(age);
            this.species = "cat";
        }
        //Cat method
        public void meow()
        {
            System.out.println(this.name + " says "+ "Meow");
            this.species = "cat";
        }
        //Constructor
        public Cat()
        {
            this.species = "cat";
        }

    }

