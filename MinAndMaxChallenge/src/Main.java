import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        int max = 0;
        int min = 0;

        while (true){
            System.out.println("Enter a number or a character in order to quit");

            try {
                int input = Integer.parseInt(scanner.nextLine());
                max = maxNumber(input, max);
                min = minNumber(input, min);
            } catch (NumberFormatException nfe){
                break;
            }
        }

        System.out.println("Min number is = " + min + " Max number is = " + max);
    }

    public static int minNumber(int input, int min){
        if (input < min || min == 0){
            return input;
        }
        return min;
    }

    public static int maxNumber (int input, int max){
        if (input > max){
            return input;
        }
        return max;
    }
}
