// Experiment-6
// Objective:   To use 2D array concept and strings in java to solve real world problem 
public class Exp_6 {
    public static void main(String[] args) {
        int[] oneDArray = {1, 2, 3, 4, 5};
        int[][] twoDArray = {{1, 2}, {3, 4}, {5, 6}};
        
        System.out.println("One-Dimensional Array:");
        for (int i = 0; i < oneDArray.length; i++) {
            System.out.print(oneDArray[i] + " ");
        }
        
        System.out.println("\nTwo-Dimensional Array:");
        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                System.out.print(twoDArray[i][j] + " ");
            }
            System.out.println();
        }

        String demoString = "GeeksforGeeks";
        String anotherString = new String("Welcome");

        System.out.println("String Literal: " + demoString);
        System.out.println("Using New Keyword: " + anotherString);
    }
}
/*
Output:
One-Dimensional Array:
1 2 3 4 5 
Two-Dimensional Array:
1 2 
3 4 
5 6 
String Literal: GeeksforGeeks
Using New Keyword: Welcome
 */