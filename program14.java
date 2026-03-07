public class program14 {
    //Write a program to find the sum of the series 1 + 2 + 3 + … + n.
    public static void main(String[] args) {
        int n = 10; // You can change this value to calculate the sum for a different n
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("The sum of the series 1 + 2 + ... + " + n + " is: " + sum);
    }
}
