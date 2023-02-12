class calculator
{
    public static void printSum(int a, int b)
    {
        System.out.println("sum=" + (a+b));
    }
}
class Dog{
    public void bark()
    {
        System.out.println("woo");
    }
}
public class staticmethods {
    
    public static void printHello() 
    {
        System.out.println("Hello");
    }
    public static void main(String[] args)
    {
        Dog rex= new Dog();     //for instance method 
        rex.bark();
        calculator.printSum(5,10);      //for static method if in ohter class
        printHello();       //if its in same class
    }
}
