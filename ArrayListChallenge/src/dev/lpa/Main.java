package dev.lpa;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        List<String> itemsList = new ArrayList<>();
        boolean flag = true;
        while (flag){
            System.out.println("Available actions:");
            System.out.println("0 - shut down");
            System.out.println("1 - add item(s) to list (comma delimited)");
            System.out.println("2 - remove item(s) (comma delimited)");
            Scanner scannerList = new Scanner(System.in);

            switch (scanner.nextInt()){
                case 0:
                    System.out.println("System shutdown");
                    flag = false;
                break;
                case 1:
                    System.out.println("Input the items below");
                    String items = scannerList.nextLine();
                    addItem(items, itemsList);
                    itemsList.sort(Comparator.naturalOrder());
                    System.out.println(itemsList);
                    break;
                case 2:
                    System.out.println("Input the items you want removed below");
                    String itemsToRemove = scannerList.nextLine();
                    removeItem(itemsToRemove, itemsList);
                    itemsList.sort(Comparator.naturalOrder());
                    System.out.println(itemsList);
                    break;
                default:
                    System.out.println("Operation is not supported");
            }
        }
    }

    private static void addItem(String items, List<String> itemsList) {
        //trim and split de String
        String[] processedString = items.trim().split(", ");

        //check for duplicates
        for (int i = 0; i < processedString.length; i++){
            if (itemsList.contains(processedString[i])){
                continue;
            }
            itemsList.add(processedString[i]);
        }
    }

    private static void removeItem(String items, List<String> itemsList) {
        //trim and split de String
        String[] processedString = items.trim().split(", ");
        itemsList.removeAll(Arrays.asList(processedString));
    }

}
