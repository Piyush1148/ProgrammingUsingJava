import java.util.Scanner;

class Person {
    String name;
    int age;

    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    public Person(String name) {
        this.name = name;
        this.age = 0;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class ConstructorOverloading{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter age (or press enter to skip): ");
        String ageInput = scanner.nextLine();

        Person person;
        if (ageInput.isEmpty()) {
            person = new Person(name);
        } else {
            int age = Integer.parseInt(ageInput);
            person = new Person(name, age);
        }

        person.display();
    }
}
/*
Output:
Enter name: Piyush
Enter age (or press enter to skip): 19
Name: Piyush
Age: 19
 */