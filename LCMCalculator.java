// Q13. Implement a program to find and display the least common multiple (LCM) of two whole numbers.
// Least Common Multiple (LCM) of two numbers, num1 and num2 is the smallest positive number that is divisible by both num1 and num2.

import java.util.Scanner;

public class LCMCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first whole number (num1): ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second whole number (num2): ");
        int num2 = scanner.nextInt();

        int lcm = calculateLCM(num1, num2);

        System.out.println("The Least Common Multiple (LCM) of " + num1 + " and " + num2 + " is: " + lcm);

        scanner.close();
    }

    private static int calculateLCM(int num1, int num2) {
        return (num1 * num2) / calculateGCD(num1, num2);
    }

    private static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
//Output: 
// Enter the first whole number (num1): 12
// Enter the second whole number (num2): 18
// The Least Common Multiple (LCM) of 12 and 18 is: 36
