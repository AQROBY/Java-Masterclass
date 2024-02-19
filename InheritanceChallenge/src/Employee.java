public class Employee extends Worker{
    private long employeeId;
    private String hireDate;

    public Employee(String name, String birthdate, String endDate, long employeeId, String hireDate){
        super(name, birthdate, endDate);
        this.employeeId = employeeId;
        this.hireDate = hireDate;
    }
}
