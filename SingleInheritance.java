import java.util.Scanner;
class Animal {
    String name;

    public void setName(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Animal: " + name);
    }
}

class Dog extends Animal {
    String breed;

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void displayDetails() {
        display();
        System.out.println("Breed: " + breed);
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Dog dog = new Dog();

        System.out.print("Enter the name of the animal: ");
        String name = scanner.nextLine();
        dog.setName(name);

        System.out.print("Enter the breed of the dog: ");
        String breed = scanner.nextLine();
        dog.setBreed(breed);

        dog.displayDetails();
    }
}
/*
Output:
Enter the name of the animal: Max
Enter the breed of the dog: Golden Retriever
Animal: Max
Breed: Golden Retriever
 */
