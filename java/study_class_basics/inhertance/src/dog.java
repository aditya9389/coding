public class dog extends animal{
    private String earShape;
    private String tailShape;
    public dog(){
        super("mutt","big",50);     //must be first instruction
    }
    public dog(String type,double weight)
    {
        this(type, weight, "perky", "curled");      //this will call other constructor
    }
    public dog(String type, double weight ,String earShape,String tailShape)
    {
        super(type,weight<15 ? "small" : (weight < 35 ? 
        "medium" : "large"),weight);
        this.earShape =earShape;
        this.tailShape = tailShape;

    }
    @Override
    public String toString() {
        return "dog [earShape=" + earShape + ", tailShape=" + tailShape + "]"+ super.toString();
    }
    public void makenoise()
    {   
        if(type=="wolf")        //type neeed to be protected type not private
        {
            System.out.println("woooooo");
        }
        bark();
        System.out.println();
    }
    @Override
    public void move(String speed) {
        // TODO Auto-generated method stub
        super.move(speed);
        //System.out.println("dogs walk and wag their tail");
        if(speed =="slow")
        {
            walk();
            wagtail();
        }
        else{
            run();
            bark();
        }

    }
    private void bark(){
        System.out.print("woof!");
    }
    private void run(){
        System.out.print("dog running!");
    } 
    private void walk(){
        System.out.print("dog walking");
    }
    public void wagtail()
    {
        System.out.println("wagtail");
    }
}
