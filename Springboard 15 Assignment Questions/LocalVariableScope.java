//Q15. The scope of local variables is only inside the method it is declared. Try the below code to understand how this works.
public class LocalVariableScope {
    
    public static void main(String[] args) {
        demonstrateScope();
    }
    
    private static void demonstrateScope() {
        int localVariable = 10; 
        System.out.println("Value of localVariable inside the method: " + localVariable);
    }
}
//Output: 
//Value of localVariable inside the method: 10
