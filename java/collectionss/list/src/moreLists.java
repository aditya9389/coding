import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
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
        System.out.println(groceries.get(1));
         if(groceries.contains("mustard"))
             System.out.println("contain mustard");
         System.out.println("index of mustard "+groceries.indexOf("mustard"));
        groceries.remove("yogurt");
        groceries.removeAll(List.of("mustard"));    //only take a collection in an argument
        System.out.println(groceries);
        groceries.clear();
        System.out.println(groceries);
        System.out.println(groceries.isEmpty());
        groceries.addAll(Arrays.asList("eggs","pickels","kol"));
        groceries.sort(Comparator.naturalOrder());

        System.out.println(groceries);
        groceries.sort(Comparator.reverseOrder());
        System.out.println(groceries);
        var groceryArray= groceries.toArray(new String[groceries.size()]);
        System.out.println(Arrays.toString(groceryArray));




    }
}
