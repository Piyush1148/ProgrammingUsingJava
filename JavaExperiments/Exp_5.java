// Experiment-5
// Objective: To use packages in java to use readymade classes available in them using square root method in math class.

public class Exp_5 {
    public void display() {
        System.out.println("Hello from MyClass in myPackage.");
    }
}

class MainClass {
    public static void main(String[] args) {
        Exp_5 myClass = new Exp_5();
        myClass.display();
    }
}
/*
Output:
Hello from MyClass in myPackage.
 */