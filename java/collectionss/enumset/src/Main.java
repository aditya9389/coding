import java.util.*;

public class Main {
    enum Weekday{SUNDAY,MONDAY,TUESDAY,WEDNESDAY, THURSDAY,FRIDAY,SATURDAY}
    public static void main(String[] args) {
        List<Weekday> annsWorkDays= new ArrayList<>(List.of(Weekday.MONDAY,Weekday.TUESDAY,Weekday.THURSDAY,Weekday.FRIDAY));
        var annsDaysSet=EnumSet.copyOf(annsWorkDays);
        System.out.println(annsDaysSet.getClass().getSimpleName());
        annsDaysSet.forEach(System.out::println);

        var allDaysSet = EnumSet.allOf(Weekday.class);
        System.out.println("...............");
        allDaysSet.forEach(System.out::println);

        Set<Weekday> newPersonDays= EnumSet.complementOf(annsDaysSet);
        System.out.println("...............");
        newPersonDays.forEach(System.out::println);

        Set<Weekday> anotherWay = EnumSet.copyOf(allDaysSet);
        anotherWay.removeAll(annsDaysSet);
        System.out.println("...............");
        anotherWay.forEach(System.out::println);

        Set<Weekday> businessDays = EnumSet.range(Weekday.MONDAY,Weekday.FRIDAY);
        System.out.println("...............");
        businessDays.forEach(System.out::println);

        Map<Weekday,String[]> employeeMap= new EnumMap<>(Weekday.class);
        employeeMap.put(Weekday.MONDAY,new String[]{"adii","jai"});
        employeeMap.put(Weekday.FRIDAY,new String[]{"adii","dont"});
        employeeMap.forEach((k,v)->System.out.println(k+":"+Arrays.toString(v)));

    }
}