public class Main {
    public static void main(String[] args){
        System.out.println("0 is " + (isPrime(0)? "" : "NOT") + " a prime number");
        System.out.println("1 is " + (isPrime(1)? "" : "NOT") + " a prime number");
        System.out.println("2 is " + (isPrime(2)? "" : "NOT") + " a prime number");
        System.out.println("3 is " + (isPrime(3)? "" : "NOT") + " a prime number");
        System.out.println("8 is " + (isPrime(8)? "" : "NOT") + " a prime number");
        System.out.println("17 is " + (isPrime(17)? "" : "NOT") + " a prime number");

        int primeNumberCounter = 0;
        for (int i = 1; i <= 1000; i++){
            if (isPrime(i)){
                primeNumberCounter++;
                System.out.println(i + " is prime, found " + primeNumberCounter + " prime numbers this far.");
            }

            if (primeNumberCounter == 3){
                break;
            }
        }
    }

    public static boolean isPrime(int wholeNumber){
        if (wholeNumber <= 2){
            return (wholeNumber == 2);
        }

        for (int divisor = 2; divisor <= wholeNumber / 2; divisor++){
            if(wholeNumber % divisor == 0){
                return false;
            }
        }
        return true;
    }
}
