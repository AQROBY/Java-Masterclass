public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int number = 0;
        for (int i = 1; i <= 1000; i++){

            if(number == 5){
                System.out.println(sum);
                break;
            }

            if (i % 3 == 0 && i % 5 == 0){
                number++;
                sum += i;
                System.out.println(i + " is divisible by 3 and 5");
            }
        }
    }
}
