public class program15{
    //15. Write a program to print the series 1 – 2 + 3 – 4 + 5 – 6 … n.
    public static void main(String[] args) {
        int n = 10; // You can change this value to calculate the series for a different n
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum -= i; // Subtract even numbers
            } else {
                sum += i; // Add odd numbers
            }
        }

        System.out.println("The sum of the series 1 - 2 + 3 - 4 + ... " + n + " is: " + sum);
    }   
}