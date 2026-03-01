public class series1 {
    //Write a program to print the series 1, 2, 3, … n.
    public static void main (String[] args){
        int n = 10; // You can change this number to print the series up to a different value
        
        System.out.println("The series from 1 to " + n + " is:");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
    }
}
