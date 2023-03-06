public class fish extends animal{
    private int gills;
    private int fins;
    
    public fish(String type, String size, double weight, int gills, int fins) {
        super(type, size, weight);
        this.gills = gills;
        this.fins = fins;
    }
    private void movemuscles()
    {
        System.out .println("muscles moving");

    }
    
    private void movebackfin()
    {
        System.out .println("backfin moving");
    }
    @Override
    public void move(String speed) {
        // TODO Auto-generated method stub
        super.move(speed);
        movemuscles();
        if(speed=="fast")
        {
           movebackfin(); 
        }
        System.out .println();
    }
    @Override
    public String toString() {
        return "fish [gills=" + gills + ", fins=" + fins + "]"+super.toString();
        
    }
    
    
    
    
}
