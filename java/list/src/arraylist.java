import java.util.Arrays;
import java.util.List;

public class arraylist {
    public static  void main(String[] args){
        String[] orArray=new String[] {"first","second"};
        var orginallist= Arrays.asList(orArray);    //will also change original source also mutable but not resizable
        orginallist.set(0,"one");
        System.out.println(orginallist);
        System.out.println(Arrays.toString(orArray));
         var listoo= List.of("sunday","monday");      //immutable by same mehtod can pass array jsust give them in breckets

    }
}
