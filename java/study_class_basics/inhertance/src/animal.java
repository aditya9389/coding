public class animal {
    protected String type;
    private String size;
    private double weight;
    
    public animal(){}
public animal(String type,String size,double weight)
{
    this.type = type;
    this.size = size;
    this.weight = weight;

}
@Override
public String toString() {
    return "animal [type=" + type + ", size=" + size + ", weight=" + weight + "]";
}
public void move(String speed)
{
    System.out.println(type+"move"  + speed);
}
public void makenoice()
{
    System.out.println(type + "makes some kind of noise");
}


}
