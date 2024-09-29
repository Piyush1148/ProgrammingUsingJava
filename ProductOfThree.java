// Q3. Implement a program to calculate the product of three positive integer values. However, if one of the integers is 7, consider only the values to the right of 7 for calculation. If 7 is the last integer, then display -1.

// Note: Only one of the three values can be 7.
//Ans: 
import java.util.Scanner;

public class ProductOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first positive integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second positive integer: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third positive integer: ");
        int num3 = scanner.nextInt();

        int product = 1; 
        boolean foundSeven = false; 

        if (num1 == 7) {
            foundSeven = true;
            product = num2 * num3; 
        } else if (num2 == 7) {
            foundSeven = true;
            product = num3; 
        } else if (num3 == 7) {
            System.out.println("-1"); 
            return; 
        } else {
            product = num1 * num2 * num3; 
        }

        
        if (foundSeven) {
            System.out.println("The product of the values to the right of 7 is: " + product);
        } else {
            System.out.println("The product of the three integers is: " + product);
        }

        scanner.close();
    }
}
// Output: 
// Enter the first positive integer: 5
// Enter the second positive integer: 3
// Enter the third positive integer: 6
// The product of the three integers is: 90