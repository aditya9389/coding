public class Main {
    public static void main(String[] args) {
        BaseClass parent = new BaseClass();
        ChildClass child= new ChildClass();
        BaseClass childReferredToAsBase =new ChildClass();

        parent.recommendedMethod();;
        System.out.println("----------");
        child.recommendedMethod();;
        System.out.println("----------");
        childReferredToAsBase.recommendedMethod();;
        System.out.println("----------");

        parent.recommendedstatic();;
        System.out.println("----------");
        child.recommendedstatic();;
        System.out.println("----------");
        childReferredToAsBase.recommendedstatic();//here it will use parent static method...which means hidding static method
        System.out.println("----------");
        String xarg="this is all i got";
        StringBuilder zarg=new StringBuilder("only saying this");
        doxyz(xarg,16,zarg);
        System.out.println("After method,xArg="+ xarg);
        System.out.println("After method,zArg="+ zarg);
    }
    private static void doxyz(String x, int y,final StringBuilder z)
    {
        final String c= x+y;
        System.out.println("c= " + c);
        x=c;
        z.append(y); //even after final values can be changed
        //z= new stringbuild is cant be done..meaning cant assing again
    }
}