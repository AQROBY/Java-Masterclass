public class Main {
    public static void main(String[] args){
        //Testing worker class
        Worker max = new Worker("Max", "1994", "Still employed");
        System.out.println("Age is equal to: " + max.getAge());
        System.out.println("Collecting pay of...$" + max.collectPay());
        max.terminate("2023");
        System.out.println("_ _ _ _");

        //Testing employee class
        Employee robert = new Employee("Robert", "1985", "no",
                1, "2021");
        System.out.println("Age is equal to: " + robert.getAge());
        System.out.println("Collecting pay of...$" + robert.collectPay());
        max.terminate("2021");
        System.out.println("_ _ _ _");

        //Testing SalariedEmployee class
        SalariedEmployee denis = new SalariedEmployee("Denis", "1987", "2023",
                2, "2022", 20000, false);
        System.out.println("Age is equal to: " + denis.getAge());
        System.out.println("Collecting pay of...$" + denis.collectPay());
        max.terminate("2023");
        denis.retire();
        System.out.println("_ _ _ _");

        //Testing HourlyEmployee class
        HourlyEmployee bogdan = new HourlyEmployee("Bogdan", "1999", "no",
                3, "2021", 20);
        System.out.println("Age is equal to: " + bogdan.getAge());
        System.out.println("Collecting pay of...$" + bogdan.collectPay());
        bogdan.terminate("2023");
        bogdan.getDoublePay();
        System.out.println("_ _ _ _");
    }
}
