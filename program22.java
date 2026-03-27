import java.util.Scanner;
public class program22 {
	//22. Write a program to check whether a number is an Armstrong number.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();   // input number
        int original = num;
        int sum = 0;

        while (num != 0) {
            int digit = num % 10;        // get last digit
            sum = sum + (digit * digit * digit); // cube of digit
            num = num / 10;              // remove last digit
        }

        if (sum == original) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong");
        }

        sc.close();
    }
}