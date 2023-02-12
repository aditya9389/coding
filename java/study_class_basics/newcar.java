public class newcar {
    public static void main(String[] args)
    {
        Cars car= new Cars();
       // car.make="alto"; not apropiat
       car.setmake("alto");
       System.out.println(car.getmodel());
       System.out.println(car.getmake());
        car.describecar();

    }
}
