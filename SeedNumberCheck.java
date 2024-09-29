// Q10. Implement a program to find out whether a number is a seed of another number.

// A number X is said to be a seed of number Y if multiplying X by its every digit equates to Y.

// E.g.: 123 is a seed of 738 as 123*1*2*3 = 738
//Ans: 
import java.util.Scanner;

public class SeedNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the seed number (X): ");
        int X = scanner.nextInt();

        System.out.print("Enter the number (Y): ");
        int Y = scanner.nextInt();

        if (isSeed(X, Y)) {
            System.out.println(X + " is a seed of " + Y + ".");
        } else {
            System.out.println(X + " is not a seed of " + Y + ".");
        }

        scanner.close();
    }

    private static boolean isSeed(int X, int Y) {
        int product = X; 
        int temp = X; 

        while (temp > 0) {
            int digit = temp % 10;
            if (digit != 0) { 
                product *= digit;
            }
            temp /= 10; 
        }
        return product == Y;
    }
}
// Output: 
// Enter the seed number (X): 123
// Enter the number (Y): 738
// 123 is a seed of 738.
