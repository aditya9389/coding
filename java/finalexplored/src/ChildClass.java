public class ChildClass extends BaseClass{
    @Override
    protected void optionalMethod() {
        System.out.println("[child:optionalmethod]:extra stuff here");
        super.optionalMethod();
    }

//    @Override
//    public void recommededMethod() {
//        System.out.println("[child:optionalmethod]:I'll do things my way");
//        optionalMethod();
//    }
    private void mandatoryMethod(){
        System.out.println("[child:mandatorymethod]:my own importanta stuff");
    }
    //will not run as mandatory method is there in baseclass
    public static void recommendedstatic(){
        System.out.println("[childClass.recommededStatic]:best way to do it");
        optionalStatic();
        //mandatoryStatic();
    }
}
