// Buffered reader and scanner class
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter input using BufferedReader: ");
        String bufferedInput = bufferedReader.readLine();
        System.out.println("BufferedReader output: " + bufferedInput);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input using Scanner: ");
        String scannerInput = scanner.nextLine();
        System.out.println("Scanner output: " + scannerInput);
    }
}
/*
output
Enter input using BufferedReader: Hello from BufferedReader
BufferedReader output: Hello from BufferedReader
Enter input using Scanner: Hello from Scanner
Scanner output: Hello from Scanner
*/