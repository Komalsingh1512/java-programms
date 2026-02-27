public class swapping {
    //Write a program to swap two numbers using a third variable.
    public static void main (String[] args){
        int a = 5;
        int b = 10;
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        
        // Swapping using a third variable
        int temp = a; 
        a = b;       
        b = temp;    
        
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
