public class Main {
    public static void main (String[] args){
        System.out.println("The sum of the digits is " + sumDigits(125));
        System.out.println("The sum of the digits is " + sumDigits(1000));
        System.out.println("The sum of the digits is " + sumDigits(1234));
        System.out.println("The sum of the digits is " + sumDigits(-6));
        System.out.println("The sum of the digits is " + sumDigits(8));
    }

    public static int sumDigits(int number){
        if (number < 0){
            return -1;
        }

        int sum = 0;

        while (true){
            sum += number % 10;
            number /= 10;

            if (number == 0){
                break;
            }
        }
        return sum;
    }
}
