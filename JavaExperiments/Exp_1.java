// Experiment-1
// Objective: To apply basic programming constructs like Branching and Looping for solving arithmetic problems like calculating factorial of a no entered by user at command prompt .


import java.util.Scanner;

public class Exp_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        scanner.close();

        if (num > 0) {
            System.out.println(num + " is a positive number.");
        } else if (num < 0) {
            System.out.println(num + " is a negative number.");
        } else {
            System.out.println("You entered zero.");
        }

        if (num >= 0) {
            if (num % 2 == 0) {
                System.out.println(num + " is an even number.");
            } else {
                System.out.println(num + " is an odd number.");
            }
        }

        System.out.print("Enter a grade (A/B/C/D/F): ");
        char grade = scanner.next().charAt(0);
        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
                System.out.println("Good job.");
                break;
            case 'C':
                System.out.println("Well done.");
                break;
            case 'D':
                System.out.println("You passed.");
                break;
            case 'F':
                System.out.println("Better try again.");
                break;
            default:
                System.out.println("Invalid grade.");
        }

        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 5 is: " + sum);

        System.out.print("Enter a number to calculate its factorial: ");
        int n = scanner.nextInt();
        long factorial = 1;
        int i = 1;

        while (i <= n) {
            factorial *= i;
            i++;
        }
        System.out.println("Factorial of " + n + " is: " + factorial);

        int positiveNum;
        do {
            System.out.print("Enter a positive number: ");
            positiveNum = scanner.nextInt();
        } while (positiveNum <= 0);
        System.out.println("You entered a positive number: " + positiveNum);

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.print("Numbers in the array: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println("\nNumbers till break:");
        for (int j = 1; j <= 10; j++) {
            if (j == 5) {
                break;
            }
            System.out.print(j + " ");
        }

        System.out.println("\nNumbers skipping 5:");
        for (int j = 1; j <= 10; j++) {
            if (j == 5) {
                continue;
            }
            System.out.print(j + " ");
        }

        scanner.close();
    }
}
/*
Output:
Enter an integer: 5
5 is a positive number.
5 is an odd number.
Enter a grade (A/B/C/D/F): A
Excellent!
Sum of numbers from 1 to 5 is: 15
Enter a number to calculate its factorial: 5
Factorial of 5 is: 120
Enter a positive number: -1
Enter a positive number: -5
Enter a positive number: 3
You entered a positive number: 3
Numbers in the array: 1 2 3 4 5 
Numbers till break:
1 2 3 4 
Numbers skipping 5:
1 2 3 4 6 7 8 9 10
*/