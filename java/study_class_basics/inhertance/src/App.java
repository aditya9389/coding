public class App {
    public static void main(String[] args) throws Exception {
        animal anmal = new animal("generic animal","huge",400);
        doanimalstuff(anmal, "slow");
        dog dogi=new dog();
        doanimalstuff(dogi , "fast");  

        dog yorkie = new dog("yokrie", 15);
        doanimalstuff(yorkie, "fast");
        dog retriver= new dog("labra", 65,"floffy","swimmer");
        doanimalstuff(retriver, "slow");

    }
    public static void doanimalstuff(animal anmal , String speed)
    {
        anmal.makenoice();
        anmal.move(speed);
        System.out.println(anmal);  //with the help of tostring

    }
}
