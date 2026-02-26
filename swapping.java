public class swapping {
    //Write a program to swap two numbers using a third variable.
    public static void main (String[] args){
        int a = 5;
        int b = 10;
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        
        // Swapping using a third variable
        int temp = a; // Store the value of a in temp
        a = b;       // Assign the value of b to a
        b = temp;    // Assign the value of temp (original a) to b
        
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
