public class BaseClass {
    public final void recommendedMethod(){

        System.out.println("[BaseClass.recommendedMethod]:Best way to do it");
        optionalMethod();
        mandatoryMethod();
    }
    protected void optionalMethod(){
        System.out.println("[BaseClass.recommendedMethod]:customize optional method");
    }
    private void mandatoryMethod()
    {
        System.out.println("[BaseClass.recommendedMethod]:non-negotiable");
    }

    public static void recommendedstatic(){
        System.out.println("[BaseClass.recommededStatic]:best way to do it");
        optionalStatic();
        mandatoryStatic();
    }
    protected static void optionalStatic()
    {
        System.out.println("[BaseClass.optionalStatic]:optional");

    }
    private static void mandatoryStatic()
    {
        System.out.println("[BaseClass.mandatoryStatic]:mandatory");

    }

}
