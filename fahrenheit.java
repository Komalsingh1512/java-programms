public class fahrenheit {
    //Write a program to convert Fahrenheit to Celsius.
    public static void main (String[] args){
        double fahrenheit = 98.6;
        double celsius = (fahrenheit - 32) * 5.0/9.0;
        System.out.println(fahrenheit + " degrees Fahrenheit is equal to " + celsius + " degrees Celsius.");
    }
}