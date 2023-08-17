import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Integer five =5;
        Integer[] others={0,5,10,-50};
        for(int i : others)
        {
            int val=five.compareTo(i);
            System.out.println("name="+ i+ "diff=" +val);
        }
        String banana="banana";
        String[] fruit={"apple","banana"};
        for(String i : fruit)
        {
            int val=banana.compareTo(i);
            System.out.println("name="+ i+ "diff=" +val);
        }
        Arrays.sort(fruit);
        System.out.println(Arrays.toString(fruit));
        student tim=new student("tim",1);
        student[] stu={new student("zach",2),new student("tim",3),new student("ann",3)};
        Arrays.sort(stu);   //cant do without implimenting comparable
        System.out.println(Arrays.toString(stu));
        System.out.println(tim.compareTo(new student("tim")));  //return 0 if equall
        Comparator<student> gpasorter=new Studentgpacomp();
        Arrays.sort(stu,gpasorter);
        System.out.println(Arrays.toString(stu));
    }}
    class student implements Comparable<student>{
        String name;
        private int id;
        protected double gpa;
        public student(String name,int gpa)
        {
            this.name=name;
            this.gpa=gpa;
        }
        public student(String name)
        {
            this.name=name;
            this.gpa=0;
        }
        public String toString()
        {
            return name+ "-"+ gpa;
        }

//        @Override
//        public int compareTo(Object o) {
//            student other =(student) o;
//            return name.compareTo(other.name);
//        }

//        @Override
//        public int compareTo(student o) {
//            return Integer.valueOf(id).compareTo(Integer.valueOf(o.id));
//        }
//

        @Override
        public int compareTo(student o) {
        return name.compareTo(o.name);
}
    }
        class Studentgpacomp implements Comparator<student>
        {
            public int compare(student o1,student o2)
            {
                return (o1.gpa+o1.name).compareTo(o2.gpa+o2.name);
            }
        }
