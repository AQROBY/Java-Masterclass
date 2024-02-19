public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, int pagesPrinted, boolean duplex)
    {
        this.tonerLevel = validateTonerLevel(tonerLevel);
        this.pagesPrinted = pagesPrinted;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount){
        tonerLevel += tonerAmount;
        int tonerLevelValidation = validateTonerLevel(tonerLevel);

        if (tonerLevelValidation == -1){
            return tonerLevelValidation;
        }

        return tonerLevel;
    }

    public void printPages(int pages){
        if (duplex){
            pagesPrinted += pages * 2;
            System.out.println("Duplex printer");
        }
        else {
            pagesPrinted += pages;
        }
        System.out.println("Printing pages..." + pages +  ". Pages printed so far..." + pagesPrinted);
    }

    private int validateTonerLevel(int tonerLevel){
        if (tonerLevel > 100 || tonerLevel < 0){
            return -1;
        }
        return tonerLevel;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }
}
