public class posneg {
    //Write a program to check whether a number is Positive or Negative.
    public static void main (String[] args){
        int number = -5; // You can change this number to test with different values
        
        if (number > 0) {
            System.out.println(number + " is a Positive number.");
        } else if (number < 0) {
            System.out.println(number + " is a Negative number.");
        } else {
            System.out.println("The number is Zero.");
        }
    }
}
