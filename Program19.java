import java.util.Scanner;
//19. Write a program to print the Fibonacci series.
public class Program19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();  // number of terms
        int a = 0, b = 1, next;

        for (int i = 0; i < n; i++) {
            System.out.println(a + " ");
            next = a + b;
            a = b;
            b = next;
        }
        sc.close();
    }
}