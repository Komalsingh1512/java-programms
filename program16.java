public class program16 {
    //16. Write a program to find the sum of the series 1/2 + 2/3 + 3/4 + … n.
    public static void main(String[] args) {
        int n = 10; // You can change this value to calculate the sum for a different n
        double sum = 0.0;

        for (int i = 1; i <= n; i++) {
            sum += (double) i / (i + 1); // Add the term i/(i+1) to the sum
        }

        System.out.println("The sum of the series 1/2 + 2/3 + ... " + n + "/(n+1) is: " + sum);
    }
}
