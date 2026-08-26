import java.util.Scanner;

public class BasicArithmetic {
    public static void main(String[] args) {
        // Initialize Scanner object to read from standard system input
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();
        
        int sum = num1 + num2;
        System.out.println("The sum of the numbers is: " + sum);
        
        input.close(); // Clean up resource
    }
}
