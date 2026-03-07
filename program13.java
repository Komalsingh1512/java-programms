public class program13 {
    //. Write a program to print the series 1, 3, 6, 10, … n.
    public static void main(String[] args) {
        int n = 10; // You can change this value to generate more or fewer terms in the series
        int sum = 0;

        System.out.println("The series is:");
        for (int i = 1; i <= n; i++) {
            sum += i;
            System.out.print(sum + " ");
        }
    }
}
