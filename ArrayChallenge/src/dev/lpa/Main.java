package dev.lpa;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(100);
        }

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(sortIntegers(array)));

    }

    private static int[] sortIntegers(int[] array){

        int[] sortedArray = Arrays.copyOf(array, array.length);

        boolean flag = true;
        int temp;

        while(flag){
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++){
                if (sortedArray[i] < sortedArray[i + 1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }

        }

        return sortedArray;
    }
}
