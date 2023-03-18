public class Worker {
    private String name;
    private String birthDate;
    protected String endDate;
    public Worker()
    {

    }
    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }
    public int getAge()
    {
        int current=2025;
        int birthyear=Integer.parseInt(birthDate.substring(6));
        return(current - birthyear);
    }
    public double collectpay()
    {
        return 0.0;
    }
    public void terminate(String endDate)
    {
        this.endDate=endDate;
    }
    @Override
    public String toString() {
        return "Worker [name=" + name + ", birthDate=" + birthDate + ", endDate=" + endDate + "]";
    }
    
    
}
