// Experiment-7
// Objective: To understand the usage of superclass and final method , variables and class
class Employee {
    String name;
    final int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
    }
}

class Clerk extends Employee {
    String department;

    Clerk(String name, int id, String department) {
        super(name, id);
        this.department = department;
    }

    void display() {
        super.display();
        System.out.println("Department: " + department);
    }
}

public class Exp_7 {
    public static void main(String[] args) {
        Clerk clerk = new Clerk("John Doe", 101, "Sales");
        clerk.display();
    }
}
/*
Output:
Employee Name: John Doe
Employee ID: 101
Department: Sales
 */