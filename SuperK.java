// Super keyword
import java.util.Scanner;

class Parent {
    String parentMessage;

    public Parent(String message) {
        this.parentMessage = message;
    }

    public void display() {
        System.out.println("Parent message: " + parentMessage);
    }
}

class Child extends Parent {
    String childMessage;

    public Child(String parentMessage, String childMessage) {
        super(parentMessage);
        this.childMessage = childMessage;
    }

    public void display() {
        super.display();
        System.out.println("Child message: " + childMessage);
    }
}

public class SuperK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter parent message: ");
        String parentMsg = scanner.nextLine();
        
        System.out.print("Enter child message: ");
        String childMsg = scanner.nextLine();

        Child child = new Child(parentMsg, childMsg);
        child.display();
    }
}
/*Output:
Enter parent message: Hello from Parent
Enter child message: Hello from Child
Parent message: Hello from Parent
Child message: Hello from Child
 */