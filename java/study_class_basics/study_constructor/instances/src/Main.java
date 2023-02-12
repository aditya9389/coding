public class Main {
    public static void main(String[] args)
    {
        House bluehouse = new House("blue");
        House another= bluehouse;
        System.out.println(bluehouse.getcolor());
        System.out.println(another.getcolor());
        another.setcolor("red");
        System.out.println(bluehouse.getcolor());
        System.out.println(another.getcolor());
    }
}
