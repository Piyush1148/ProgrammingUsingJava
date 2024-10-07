import java.util.Scanner;

public class BranchingLooping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("You entered a positive number.");
        } else if (number < 0) {
            System.out.println("You entered a negative number.");
        } else {
            System.out.println("You entered zero.");
        }

        System.out.print("Enter how many times to repeat a message: ");
        int count = scanner.nextInt();

        for (int i = 1; i <= count; i++) {
            System.out.println("This is message number: " + i);
        }
    }
}
/*
Output:
Enter a number: 0
You entered zero.
Enter how many times to repeat a message: 4
This is message number: 1
This is message number: 2
This is message number: 3
This is message number: 4
 */