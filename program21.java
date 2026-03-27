 import java.util.Scanner;
public class program21 {
    // 21. Write a program to check whether a number is a Palindrome.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();   // input number
        int original = num;
        int reverse = 0;

        while (num != 0) {
            int digit = num % 10;       // get last digit
            reverse = reverse * 10 + digit; // build reverse
            num = num / 10;             // remove last digit
        }

        if (original == reverse) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        sc.close();
    }
}
