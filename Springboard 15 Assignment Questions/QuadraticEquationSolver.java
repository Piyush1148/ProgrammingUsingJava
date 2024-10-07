// Q 2. Quadratic equation is an equation with degree 2 in the form of ax2 +bx + c = 0 where a, b and c are the coefficients.
// Implement a program to solve a quadratic equation.

// Find the discriminant value using the formula given below.

// discriminant = b2 - 4ac

// If the discriminant is 0, the values of both the roots will be same. Display the value of the root.

// If the discriminant is greater than 0, the roots will be unequal real roots. Display the values of both the roots.

// If the discriminant is less than 0, there will be no real roots. Display the message "The equation has no real root"

// Use the formula given below to find the roots of a quadratic equation.

// x = (-b ± discriminant)/2a
// Ans: 

import java.util.Scanner;

public class QuadraticEquationSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();
        
        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();
        
        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();

        double discriminant = b * b - 4 * a * c;
        System.out.println("Discriminant: " + discriminant);

        if (discriminant > 0) {
            
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The roots are real and different.");
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } else if (discriminant == 0) {
        
            double root = -b / (2 * a);
            System.out.println("The roots are real and the same.");
            System.out.println("Root: " + root);
        } else {
            System.out.println("The equation has no real roots.");
        }
        scanner.close();
    }
}
// OutPut: 
// Enter coefficient a: 7
// Enter coefficient b: 5
// Enter coefficient c: 3
// Discriminant: -59.0
// The equation has no real roots.