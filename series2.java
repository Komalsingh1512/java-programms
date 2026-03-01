public class series2 {
    //Write a program to print the series 2, 4, 6, … n.
    public static void main (String[] args){
        int n = 20; // You can change this number to print the series up to a different value
        
        System.out.println("The series from 2 to " + n + " is:");
        for (int i = 2; i <= n; i += 2) {
            System.out.print(i + " ");
        }
    }
}
