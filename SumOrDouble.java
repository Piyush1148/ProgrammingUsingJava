// Q. 1 Implement a program to display the sum of two given numbers if the numbers are same. If the numbers are not same, display the double of the sum.
// Ans: 
import java.util.Scanner;
public class SumOrDouble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        int sum = num1 + num2;
        if (num1 == num2) {
            System.out.println("The sum of the two numbers is: " + sum);
        } else {
            System.out.println("The double of the sum is: " + (2 * sum));
        }
        scanner.close();
    }
}
// Output: 
// Enter the first number: 4
// Enter the second number: 4
// The sum of the two numbers is: 8