import java.util.Random;

public class extragenerics {
    private String name;
    private String course;
    private int yearStarted;
    protected static Random random = new Random();
    private static String[] firstname={"ann","bill","cathey"};
    private static String[] courses={"c++","java","python"};
    public extragenerics()
    {
        int lastnameindex = random.nextInt(56,92);
        name= firstname[random.nextInt(5)] + " " + (char) lastnameindex;
        course = courses[random.nextInt(3)];
        yearStarted=random.nextInt(2018,2023);

    }
    public String toString()
    {
        return "%-15s %-15s %d".formatted(name,course,yearStarted);
    }
    
}
