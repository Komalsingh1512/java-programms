public class programm25 {
    //Prime & Range Programs
	//25. Write a program to print prime numbers from 1 to n.
	public static void main(String[] args) {
        int n = 100; // You can change this value to print prime numbers up to n
        System.out.println("Prime numbers from 1 to " + n + ":");
        for (int i = 2; i <= n; i++) {
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
