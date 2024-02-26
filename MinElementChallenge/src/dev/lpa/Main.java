package dev.lpa;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please input length of array.");
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] array = readIntegers(length);
        System.out.println(Arrays.toString(array));
        int min = findMin(array);
        System.out.println("min = " + min);

        System.out.println("Array before reverse: " + Arrays.toString(array));
        reverse(array);
        System.out.println("Array after reverse: " + Arrays.toString(array));
    }

    public static int[] readIntegers(int length){
        System.out.println("Please input the numbers");
        int[] array = new int[length];
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] arrayStrings = input.split(",");

        for(int i = 0; i < array.length; i++){
            array[i] = Integer.parseInt(arrayStrings[i].trim());
        }

        return array;
    }

    public static int findMin(int[] array){
        return Arrays.stream(array).min().getAsInt();
    }

    public static void reverse(int[] array){
        int index = 1;
        for(int i = 0; i < array.length / 2; i++){
            int temp = array[i];
            array[i] = array[array.length - index];
            array[array.length - index] = temp;
            index++;
        }
    }
}
