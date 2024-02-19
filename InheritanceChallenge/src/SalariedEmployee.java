public class SalariedEmployee extends Employee{
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthdate, String endDate, long employeeId,
                            String hireDate, double annualSalary, boolean isRetired) {
        super(name, birthdate, endDate, employeeId, hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }

    public void retire(){
        System.out.println("Retiring...");
        isRetired = true;
    }
}
