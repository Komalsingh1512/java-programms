public class program17 {
    //17. Write a program to check whether a number is Prime.
    public static void main(String[] args) {
        int number = 29; // You can change this value to check for a different number
        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false; // 0 and 1 are not prime numbers
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false; // If number is divisible by any number other than 1 and itself, it's not prime
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
