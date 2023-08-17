import java.util.Random;

public class Main {
    public static void main(String[] args) {

        days weekday= days.wedneday;
        System.out.println(weekday);
        System.out.printf("name is %s,ordinal value is %d%n",weekday.name(),weekday.ordinal());
        weekday= getrandonday();
        System.out.println(weekday);
        if(weekday==days.wedneday)
        {
            System.out.println("horay found a wednesday");
        }
        switchday(weekday);
        System.out.println(weekday.getdate());
    }
    public static days getrandonday(){
        int randomi=new Random().nextInt(3);
        var alldat=days.values();
        return alldat[randomi];
    }
    public static void switchday(days weekday)
    {
        int weeki=weekday.ordinal()+1;
        switch(weekday)
        {
            case sunday -> System.out.println("sunday is the day" +weeki);
            case tuesday -> System.out.println(weeki);
            default -> System.out.println("Hello world!");
        }
    }
}