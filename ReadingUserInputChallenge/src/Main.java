import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean isFinished = false;
        int sum = 0;
        int numbers = 1;

        do {
            try {
                System.out.println("Enter number #" + numbers);
                sum += Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e){
                System.out.println("Invalid number");
                continue;
            }

            if (numbers == 5){
                isFinished = true;
            }
            numbers++;

        } while (!isFinished);

        System.out.println(sum);
    }
}
