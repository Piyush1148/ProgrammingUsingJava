// Q8. Implement a program to find the number of rabbits and chickens in a farm. Given the number of heads and legs of the chickens and rabbits in a farm, identify and display the number of chickens and rabbits in the farm.

// If the given input cannot make a valid number of rabbits and chickens, then display an appropriate message.
//Ans: 
import java.util.Scanner;

public class FarmAnimals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of heads: ");
        int heads = scanner.nextInt();
        
        System.out.print("Enter the number of legs: ");
        int legs = scanner.nextInt();

        int rabbits = (legs - 2 * heads) / 2;
        int chickens = heads - rabbits;

        if (rabbits < 0 || chickens < 0 || (legs != (2 * chickens + 4 * rabbits))) {
            System.out.println("Invalid input. Cannot determine the number of rabbits and chickens.");
        } else {
            System.out.println("Number of chickens: " + chickens);
            System.out.println("Number of rabbits: " + rabbits);
        }

        scanner.close();
    }
}
//Output: 
// Enter the number of heads: 10
// Enter the number of legs: 32
// Number of chickens: 6
// Number of rabbits: 4
