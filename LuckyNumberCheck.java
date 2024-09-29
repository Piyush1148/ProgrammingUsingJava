// Q12. Implement a program to check whether a given number is a lucky number.

// A lucky number is a number whose sum of squares of every even-positioned digit (starting from the second position) is a multiple of 9.

// E.g. - 1623 = 62+32 = 45 is a multiple of 9 and hence is a lucky number.
//Ans: 
import java.util.Scanner;

public class LuckyNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Enter a number: ");
        String number = scanner.nextLine(); 
    
        if (isLuckyNumber(number)) {
            System.out.println(number + " is a lucky number.");
        } else {
            System.out.println(number + " is not a lucky number.");
        }

    
        scanner.close();
    }

    private static boolean isLuckyNumber(String number) {
        int sumOfSquares = 0;

    
        for (int i = 1; i < number.length(); i += 2) { 
            int digit = Character.getNumericValue(number.charAt(i)); 
            sumOfSquares += Math.pow(digit, 2); 
        }

        return sumOfSquares % 9 == 0;
    }
}
//OUtput: 
// Enter a number: 1623
// 1623 is not a lucky number.
