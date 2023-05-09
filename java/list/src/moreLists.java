import java.util.ArrayList;
import java.util.List;

public class moreLists {
    public static void main(String[] args)
    {
        String[] items ={"apples", "bananas"};
        List<String> list = List.of(items);
        System.out.println(list);       //imutable cant add new atime
        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("yogrut");    //new item can be add in arratlist
        System.out.println(groceries);
        ArrayList<String> nextlist = new ArrayList<>(
                List.of("picles","mustard"));
        System.out.println(nextlist);
        groceries.addAll(nextlist);
        System.out.println(groceries);
    }
}
