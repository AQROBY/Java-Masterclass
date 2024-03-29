package dev.lpa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args){
        String[] originalArray = new String[] {"First", "Second", "Third"};
        var originalList = Arrays.asList(originalArray);

        originalList.set(0, "one");
        System.out.println("list: " + originalList);
        System.out.println("array: " + Arrays.toString(originalArray));

        originalList.sort(Comparator.naturalOrder());
        System.out.println("array: " + Arrays.toString(originalArray));

        List<String> newList = Arrays.asList("Sunday", "Monday", "Tuesday");
        System.out.println(newList);

        var anotherList = Arrays.asList("one", "two");
        System.out.println(anotherList);

        var yetAnotherList = List.of("three", "four");
        System.out.println(yetAnotherList);

        ArrayList<String> arr = new ArrayList<>(List.of("Robert", "Denis"));
        arr.add("Bogdan");
        System.out.println(arr);
    }
}
