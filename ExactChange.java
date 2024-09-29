// Q4. You have x number of $5 notes and y number of $1 notes. You want to purchase an item for amount z. The shopkeeper wants you to provide exact change. You want to pay using a minimum number of notes. How many $5 notes and $1 notes will you use?

// Implement a program to find out how many $5 notes and $1 notes will be used. If an exact change is not possible, then display -1.
// Ans: 
import java.util.Scanner;

public class ExactChange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of $5 notes (x): ");
        int x = scanner.nextInt();

        System.out.print("Enter the number of $1 notes (y): ");
        int y = scanner.nextInt();

        System.out.print("Enter the amount to be paid (z): ");
        int z = scanner.nextInt();

        int fivesToUse = 0;
        int onesToUse = 0;

        fivesToUse = Math.min(z / 5, x);
        int remainingAmount = z - (fivesToUse * 5);

        if (remainingAmount <= y) {
            onesToUse = remainingAmount;
            System.out.println("Use " + fivesToUse + " $5 notes and " + onesToUse + " $1 notes.");
        } else {
            while (fivesToUse >= 0) {
                remainingAmount = z - (fivesToUse * 5);
                if (remainingAmount <= y) {
                    onesToUse = remainingAmount;
                    System.out.println("Use " + fivesToUse + " $5 notes and " + onesToUse + " $1 notes.");
                    return; 
                }
                fivesToUse--; 
            }

            System.out.println("-1");
        }

        scanner.close();
    }
}
// output: 
// Enter the number of $5 notes (x): 3
// Enter the number of $1 notes (y): 4
// Enter the amount to be paid (z): 19
// Use 3 $5 notes and 4 $1 notes.
