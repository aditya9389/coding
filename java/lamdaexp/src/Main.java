import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    record Person(String firstName, String lastName) {
        @Override
        public String toString() {
            return
                    firstName + ' ' +
                            lastName;
        }
    }

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>(List.of(
                new Main.Person("lucky", "van"),
                new Person("sally", "malley"),
                new Person("lolo", "polo")
        ));
        var comparatorlastname = new Comparator<Person>() {
            public int compare(Person o1, Person o2) {
                return o1.lastName.compareTo(o2.lastName);
            }
        };
        //can be sort in two types
        people.sort(comparatorlastname);
//        people.sort(new Comparator<Person>() {
//            public int compare(Person o1, Person o2) {
//                return o1.lastName.compareTo(o2.lastName);
//            }
//        });

        people.sort((o1, o2) -> o1.lastName.compareTo(o2.lastName));
        interface EnhancedCompartor<T> extends Comparator<T>
        {
            int secondLevel(T o1,T o2);
        }
        var comparatormixed = new EnhancedCompartor<Person>()
        {

            @Override
            public int compare(Person o1, Person o2) {
                int result = o1.lastName.compareTo(o2.lastName);
                return(result==0? secondLevel(o1,o2):result);
            }

            @Override
            public int secondLevel(Person o1, Person o2) {
                return o1.firstName.compareTo(o2.lastName);
            }
        };
        people.sort(comparatormixed);
        System.out.println(people);
    }
}
















