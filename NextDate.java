// Q5. Implement a program to generate and display the next date of a given date.

// The date will be provided as day, month and year as shown in the below table.

// The output should be displayed in the format: day-month-year.

// Assumption: The input will always be a valid date.
//Ans: 
import java.util.Scanner;

public class NextDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter day: ");
        int day = scanner.nextInt();

        System.out.print("Enter month: ");
        int month = scanner.nextInt();

        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        day++;
        if (day > daysInMonth(month, year)) {
            day = 1; 
            month++; 
            if (month > 12) {
                month = 1;
                year++; 
            }
        }

        System.out.printf("Next date: %02d-%02d-%04d\n", day, month, year);

        scanner.close();
    }
    private static int daysInMonth(int month, int year) {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2: 
                if (isLeapYear(year)) {
                    return 29;
                } else {
                    return 28; 
                }
            default:
                return 0; 
        }
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
// Output: 
// Enter day: 31
// Enter month: 12
// Enter year: 2023
// Next date: 01-01-2024
