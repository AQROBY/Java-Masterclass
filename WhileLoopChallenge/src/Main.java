public class Main {
    public static void main(String[] args) {
        int number = 5;
        int evenNumbers = 0;
        int oddNumbers = 0;
        while (number <= 20){

            if (isEvenNumber(number)){
                evenNumbers++;
                System.out.println(number);
            } else{
                oddNumbers++;
            }

            if (evenNumbers == 5){
                break;
            }
            number++;
        }
        System.out.println("Even numbers found " + evenNumbers);
        System.out.println("Odd numbers found " + oddNumbers);
    }

    public static boolean isEvenNumber(int number){
        if (number % 2 == 0){
            return true;
        }
        return false;
    }
}
