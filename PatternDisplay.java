// Q14. Implement a program to display the below pattern.

// ***

// **

// *

// **

// *
//ANs: 

public class PatternDisplay {
    public static void main(String[] args) {
        displayPattern();
    }
    private static void displayPattern() {
        for (int i = 3; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); 
        }

        // Second half of the pattern
        for (int i = 2; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
//Output: 
// ***
// **
// *
// **
// *
