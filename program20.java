import java.util.Scanner;

public class program20 {
    //20. Write a program to find the Sum of digits of a number.
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();  // input number
        int sum = 0;

        while (num != 0) {
            int digit = num % 10;  // get last digit
            sum = sum + digit;     // add to sum
            num = num / 10;        // remove last digit
        }
        
        System.out.println("Sum of digits = " + sum);

        sc.close();
    }
}
