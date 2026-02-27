//Write a program to calculate the salary of a person (basic + allowances – deductions like this 5 attributes).
public class salary {
    public static void main (String[] args){
        double basicSalary = 50000; // Basic salary
        double hra = 0.2 * basicSalary; // House Rent Allowance (20% of basic)
        double da = 0.1 * basicSalary; // Dearness Allowance (10% of basic)
        double deductions = 5000; // Total deductions
        
        // Calculate total salary
        double totalSalary = basicSalary + hra + da - deductions;
        
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("House Rent Allowance: " + hra);
        System.out.println("Dearness Allowance: " + da);
        System.out.println("Deductions: " + deductions);
        System.out.println("Total Salary: " + totalSalary);
    }
}
