import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Collection<String> list = new HashSet<>();
        String[] names ={"anna", "bob","carrl"};
        list.addAll(Arrays.asList(names));
        System.out.println(list);

        list.add("fred");
        list.addAll(Arrays.asList("georh","gajls"));
        System.out.println(list);
        System.out.println("dary is in list?"+list.contains("anna"));
        list.removeIf(s->s.charAt(0)=='g');
        System.out.println(list);
  //      list.sort();      cannot do that
        

    }
}