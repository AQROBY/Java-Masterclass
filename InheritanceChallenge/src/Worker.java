public class Worker {
    private String name;
    private String birthDate;
    private String endDate;

    public Worker(String name, String birthDate, String endDate){
        this.name = name;
        this.birthDate = birthDate;
        this.endDate = endDate;
    }

    public int getAge(){
        return 2024 - Integer.parseInt(birthDate);
    }

    public double collectPay(){
        return 2000;
    }

    public void terminate(String endDate){
        this.endDate = endDate;
        System.out.println("Terminated contract in " + endDate);
    }
}
