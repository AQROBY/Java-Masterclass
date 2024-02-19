public class Main {
    public static void main(String[] args){
        Printer printer = new Printer(-10, 1, false);
        System.out.println(printer.getTonerLevel());

        printer.addToner(10);
        System.out.println(printer.getTonerLevel());
        printer.printPages(62);

        System.out.println("----");

        Printer duplexPrinter = new Printer(10, 0, true);
        duplexPrinter.addToner(10);
        System.out.println(duplexPrinter.getTonerLevel());
        duplexPrinter.printPages(60);
    }
}
