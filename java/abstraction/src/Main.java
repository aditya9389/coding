public class Main extends animal implements make{   //all abstract methods must be declared
    public void makevoice()
    {
        System.out.println("Hello world!");
    }
    public void makemove()
    {
        System.out.println("Hello world!");
    }
    public void makesomething(){
        System.out.println("Hello world!");
    }


    public static void main(String[] args) {
        Main yes= new Main();
       // yes.makesomething();  ->  because quantifier is animal
        yes.makesome();
    }
}