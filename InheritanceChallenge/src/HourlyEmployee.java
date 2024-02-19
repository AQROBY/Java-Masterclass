public class HourlyEmployee extends Employee{
    private double hourlyPayRate;

    public HourlyEmployee(String name, String birthdate, String endDate,
                          long employeeId, String hireDate, double hourlyPayRate) {
        super(name, birthdate, endDate, employeeId, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    public void getDoublePay(){
        System.out.println("Getting double pay: " + (super.collectPay() * 2));
    }
}
