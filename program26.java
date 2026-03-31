public class program26 {
    //26. Write a program to print prime numbers between n and k.
    public static void main(String[] args) {
        int n = 10; // Starting number
        int k = 50; // Ending number
        System.out.println("Prime numbers between " + n + " and " + k + ":");
        for (int i = n; i <= k; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
