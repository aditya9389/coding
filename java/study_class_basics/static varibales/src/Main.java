 class Dog {
    static String name="aditya";     //static variable

    public void printName()
    {
        System.out.println("name=" + name);
    }
}
public class Main {
    public static void main(String[] args)
    {
        Dog rex = new Dog();
        Dog fluffy = new Dog();
        fluffy.printName();
        Dog.name="elder";
        fluffy.printName();
        rex.printName();
        Dog.name="lan";
        fluffy.printName();
    }
}
