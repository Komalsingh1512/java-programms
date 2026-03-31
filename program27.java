public class program27 {
    //Array Programs
	//27. Write a program to find the maximum element in an array.
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};
        int max = findMax(arr);
        System.out.println("The maximum element in the array is: " + max);
    }
    public static int findMax(int[] arr) {
        int max = arr[0]; // Assume the first element is the maximum
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; // Update max if current element is greater
            }
        }
        return max;
    }
}
