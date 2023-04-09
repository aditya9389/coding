
class rectangle {
    private int x;
    private int y ;
    private int width;
    private int height;
    public rectangle(){
        this(0,0);
        System.out.println("1st constructor got called");
    }
    public rectangle(int width,int height)
    {
        this(0,0,width,height);
        System.out.println("2nd constructor got called");
    }
    public rectangle(int x, int y, int width, int height){
        this.x=x;
        this.y=y;
        this.width=width;
        this.height=height;
        System.out.println("3rd constructor got called");
    }
}
public class thisuse {
    public static void main(String[] args){
        rectangle ob1= new rectangle(3,4);

    }
}
