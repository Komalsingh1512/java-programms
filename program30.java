public class program30 {
    //30. Write a program to find the sum of nth element in a series.
    public static void main(String[] args) {
        int n = 10; // Change this value to find the sum of nth element
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i; // Adding the current element to the sum
        }

        System.out.println("The sum of the first " + n + " elements in the series is: " + sum);
    }
}
