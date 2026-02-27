//Write a program to swap two numbers without using a third variable.
public class swapp2 {
    public static void main (String[] args){
        int a = 5;
        int b = 10;
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        
        // Swapping without using a third variable
        a = a + b; // Step 1: a now holds the sum of a and b
        b = a - b; // Step 2: b now holds the original value of a
        a = a - b; // Step 3: a now holds the original value of b
        
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
