public class program18 {
    //18. Write a program to find the Factorial of a number.
    public static void main(String[] args) {
        int number = 5; // You can change this value to calculate the factorial for a different number
        long factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i; // Multiply the current value of factorial by i
        }

        System.out.println("The factorial of " + number + " is: " + factorial);
    }
}
