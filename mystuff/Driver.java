package mystuff;

public class Driver
{
    public static void main(String[] args)
    {
        Stuff desk = new Stuff();

        desk.name = "desk";
        desk.amount= 1;
        desk.material = "wood";
        desk.value = 100;
        desk.weight = 200;

        Stuff computer = new Stuff();

        computer.name = "computer";
        computer.amount = 1;
        computer.material = "metal, silicone, and plastic";
        computer.value = 1800.75;
        computer.weight = 50.5;

        Stuff phone = new Stuff();

        phone.name = "phone";
        phone.amount =1;
        phone.material ="glass, silicone, plastic, and metal";
        phone.value = 750.99;
        phone.weight = 3;

        profile(desk);
        profile(computer);
        profile(phone);
    }
    public static int profile(Stuff stuff)
    {
        System.out.println("\n" + "Object: " + stuff.name);
        System.out.println("quantity: " + stuff.amount);
        System.out.println("material: " + stuff.material);
        System.out.println("value: $" + stuff.value);
        System.out.println("weight: " + stuff.weight + " ib" + "\n");
        System.out.println("====================================");
        return 0;
    }
}
