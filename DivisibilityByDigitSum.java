// Q9. Implement a program to find out whether a number is divisible by the sum of its digits. 

// Display appropriate messages.
//Ans: 

import java.util.Scanner;

public class DivisibilityByDigitSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int sumOfDigits = calculateSumOfDigits(number);

        if (sumOfDigits == 0) {
            System.out.println("The sum of digits is 0. Division by zero is not possible.");
        } else if (number % sumOfDigits == 0) {
            System.out.println(number + " is divisible by the sum of its digits (" + sumOfDigits + ").");
        } else {
            System.out.println(number + " is not divisible by the sum of its digits (" + sumOfDigits + ").");
        }

        scanner.close();
    }

    private static int calculateSumOfDigits(int number) {
        int sum = 0;

        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        return sum;
    }
}
// Output: 
// Enter a number: 23
// 23 is not divisible by the sum of its digits (5).
