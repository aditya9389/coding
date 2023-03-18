public class Employee extends Worker {

    private long employeeid;
    private String hireDate;
    public Employee(String name, String birthDate, long employeeid, String hireDate) {
        super(name, birthDate);
        this.employeeid = employeeid;
        this.hireDate = hireDate;
    }
    @Override
    public String toString() {
        return "Employee [employeeid=" + employeeid + ", hireDate=" + hireDate +  " ]" + super.toString();
    }
    
    
}
