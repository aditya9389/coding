import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class arraylistcha {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        ArrayList<String> mylist=new ArrayList<>();
        boolean flag =true;
        while(flag)
        {
            System.out.println("""
                    enter 1 for add item 
                    enter 2 for remove item
                    enter 0 for shutdown""");
           int n=in.nextInt();
            if(n==0)
            {
                flag=false;
            }
            else if (n==1) {
                String sss=in.nextLine();
                String[] ss=in.nextLine().split(",");
               // mylist.addAll(List.of(ss));
                for(String i:ss)
                {
                    String trimm= i.trim();
                    if(mylist.indexOf(trimm)<0)
                        mylist.add(trimm);
                }
                mylist.sort(Comparator.naturalOrder());
                System.out.println(mylist);
            }
            else if(n==2)
            {
                String sss=in.nextLine();
                String[] ss=in.nextLine().split(",");
                // mylist.addAll(List.of(ss));
                for(String i:ss)
                {
                    String trimm= i.trim();
                    if(mylist.indexOf(trimm)>=0)
                        mylist.remove(trimm);
                }
                mylist.sort(Comparator.naturalOrder());
                System.out.println(mylist);
            }
            else{

                System.out.println("enter valid number ");
            }
        }
    }
}
