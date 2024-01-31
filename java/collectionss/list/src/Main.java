import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

record GroceryItem(String name, String type, int count)
{
    public GroceryItem(String name){
        this(name,"Dairy",1);
    }
    @Override
    public String toString()
    {
        return String.format("%d %s in %s",count, name.toUpperCase(),type);
    }


}
public class Main {
    public static void main(String[] args) {
        GroceryItem[] groceryArray = new GroceryItem[3];
        groceryArray[0]= new GroceryItem("milk");
        groceryArray[1]= new GroceryItem("apple", "produce",6);
        groceryArray[2]=new GroceryItem("5 orranges");
        System.out.println(Arrays.toString(groceryArray));
        Object[] mas= new Object[10];
        mas[1]=new GroceryItem("you");          //example of object type var
        mas[2]= "land";
        ArrayList objectlist= new ArrayList();                  //another way use object variable type
        objectlist.add(new GroceryItem("butter"));
        objectlist.add("yogurt");

        ArrayList<GroceryItem> grocerylist= new ArrayList<>();  //in this only given data type things can go in
        grocerylist.add(new GroceryItem("apple"));
        grocerylist.add(new GroceryItem("butter"));
        grocerylist.add(0,new GroceryItem("jam"));
        grocerylist.remove(1);
        System.out.println(grocerylist);        //same as array of object
        ArrayList<String> nextLIst = new ArrayList<>(List.of("pickles","mustard"));
        System.out.println(nextLIst);



    }
}