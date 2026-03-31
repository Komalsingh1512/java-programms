public class program28 {
    //28. Write a program to count the prime numbers in an array.
    public static void main(String[] args) {
        int[] arr = {10, 15, 2, 3, 5, 7, 11, 13};
        int primeCount = countPrimes(arr);
        System.out.println("Number of prime numbers in the array: " + primeCount);
    }
    public static int countPrimes(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (isPrime(num)) {
                count++;
            }
        }
        return count;
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
