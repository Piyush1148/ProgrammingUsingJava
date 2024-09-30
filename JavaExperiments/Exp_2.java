//Experiment-2
//Objective: To use the facility of java to read data from the keyboard for any program 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Exp_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a string using BufferedReader: ");
        String input1 = reader.readLine();
        System.out.println("You entered: " + input1);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer using Scanner: ");
        int input2 = scanner.nextInt();
        System.out.println("You entered: " + input2);

        System.out.print("Enter a string using Scanner: ");
        scanner.nextLine();  // Consume newline
        String input3 = scanner.nextLine();
        System.out.println("You entered: " + input3);

        scanner.close();
    }
}
/*
 Output:
Enter a string using BufferedReader: Hello from BufferedReader
You entered: Hello from BufferedReader
Enter an integer using Scanner: 42
You entered: 42
Enter a string using Scanner: Hello from Scanner
You entered: Hello from Scanner
 */