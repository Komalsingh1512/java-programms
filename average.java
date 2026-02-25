public class average {
    public static void main (String[] args){
        int sum= 0;
        for (int i=1; i<=100; i++){
            sum += i;
        }   
        double average = sum / 100.0;
        System.out.println("The average of the first 100 natural numbers is: " + average);
    }
}
