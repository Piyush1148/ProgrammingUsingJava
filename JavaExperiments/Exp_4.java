// Experiment-4
// Objective: To use concept of method overloading in a java program to create a class with same function name with different number of parameters.
class DisplayOverloading {
    public void disp(char c) {
        System.out.println(c);
    }

    public void disp(char c, int num) {
        System.out.println(c + " " + num);
    }
}

class Exp_4 {
    public static void main(String args[]) {
        DisplayOverloading obj = new DisplayOverloading();
        obj.disp('a');
        obj.disp('a', 10);
        
        Thread thread1 = new Thread();
        Thread thread2 = new Thread("MyThread");
        
        System.out.println("Thread 1 Name: " + thread1.getName());
        System.out.println("Thread 2 Name: " + thread2.getName());
    }
}
/*
Output:
a
a 10
Thread 1 Name: Thread-0
Thread 2 Name: MyThread 
*/