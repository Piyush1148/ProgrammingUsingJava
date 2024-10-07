// Q11. Implement a program to check whether a given number is an Armstrong number.

// An Armstrong number is an n-digit number that is equal to the sum of the nth powers of its individual digits.

// E.g.: 371 is an Armstrong number as 33 + 73 + 13=371

//         1634 is an Armstrong number as 14 + 64 + 34+ 44=1634

// Hint

// Use Math.pow(double a, double b) method to calculate the power of a number
//Ans: 
import java.util.Scanner;

public class ArmstrongNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        scanner.close();
    }
    private static boolean isArmstrong(int number) {
        int sum = 0;
        int originalNumber = number;
        int numberOfDigits = String.valueOf(number).length(); 

        while (number > 0) {
            int digit = number % 10; 
            sum += Math.pow(digit, numberOfDigits);
            number /= 10;
        }

    
        return sum == originalNumber;
    }
}
// Output: 
// Enter a number: 123
// 123 is not an Armstrong number.
