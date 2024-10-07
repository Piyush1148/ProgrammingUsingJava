import java.util.Scanner;

public class TwoDArrayString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();
        scanner.nextLine();

        String[][] array = new String[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter value for element [" + i + "][" + j + "]: ");
                array[i][j] = scanner.nextLine();
            }
        }

        System.out.println("You entered:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
/*
Output:
Enter the number of rows: 2
Enter the number of columns: 3
Enter value for element [0][0]: Apple
Enter value for element [0][1]: Banana
Enter value for element [0][2]: Cherry
Enter value for element [1][0]: Date
Enter value for element [1][1]: Fig
Enter value for element [1][2]: Grape
You entered:
Apple Banana Cherry 
Date Fig Grape 
 */