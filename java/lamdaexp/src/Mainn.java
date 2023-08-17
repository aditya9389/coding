import java.util.ArrayList;
import java.util.List;

public class Mainn {
    public static void main(String[] args)
    {
        List<String> list = new ArrayList<>(
                List.of("alpha","charli","delta")
        );
        for(String s: list)
        {
            System.out.println(s);
        }
        System.out.println("-------");
        list.forEach((s)->System.out.println(s));
//        list.forEach(s->System.out.println(s));
//        list.forEach((var s)->System.out.println(s));

//        *list.forEach( var s->System.out.println(s)); this one is not valid

        final String pre="isro";
        // String s="addiiii"; cant be done
        list.forEach((s)->      //s must be new
        {
            char first = s.charAt(0);
            System.out.println(pre +  " "+ s + " means "+ first);

        });
        // now we cant do pre="lll";
/*int*/    var result = calculator((a,b)->a+b,5,2);//here 5 2 are int passed so compiler guess 1st
        var result2= calculator((a,b)->a+" "+b,"lolo","golo");
        //work of above lamda is to override this method else we need to do like below
        var result3= calculator(new Operation<String>() {
            @Override
            public String operate(String value1, String value2) {
                return value1 + value2;
            }
        }, "lolo", "golo");
        var result4= calculator((a,b)->{return a+" "+b;},"lolo","golo"); //return is required if method ask when brackets are used
    }

    public static <T> T calculator(Operation<T> function ,T value1,T value2)
    {
        T result = function.operate(value1,value2);
        System.out.println("resutl of operation: "+ result);
        return result;
    }
//    public static <T> T calculator(BinaryOperator<T> function , T value1, T value2)
//    {
//        T result = function.apply(value1,value2);
//        System.out.println("resutl of operation: "+ result);
//        return result;
//    }       it is by util package

}
