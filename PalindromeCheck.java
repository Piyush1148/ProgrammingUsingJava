// Q7. Implement a program to check whether a given number is a palindrome.

// Palindrome is a sequence that reads the same backwards as forwards.

// E.g.: 121, 1331, 2332, 78900987, 123456654321,  etc.
//Ans: 
import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }

        scanner.close();
    }
    private static boolean isPalindrome(int number) {
        int originalNumber = number; 
        int reversedNumber = 0; 

        while (number > 0) {
            int digit = number % 10; 
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        return originalNumber == reversedNumber;
    }
}
// Output: 
// Enter a number: 121
// 121 is a palindrome.
