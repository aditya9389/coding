public abstract  class animal {
    int a;
    public abstract void makevoice();
    public abstract void makemove();
}
interface make{
    default void makesome(){
        System.out.println("impliment me");
    }
    static void makeso(){
        System.out.println("impliment me");
    }
    private static void makes(){
        System.out.println("impliment me");
    }
}