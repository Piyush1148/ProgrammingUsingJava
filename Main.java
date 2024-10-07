// class and objects
import java.util.Scanner;

class Car {
    String brand;
    String model;
    int year;

    public void setDetails(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void displayDetails() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Car Model: " + model);
        System.out.println("Manufacturing Year: " + year);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car car = new Car();

        System.out.print("Enter car brand: ");
        String brand = scanner.nextLine();

        System.out.print("Enter car model: ");
        String model = scanner.nextLine();

        System.out.print("Enter car manufacturing year: ");
        int year = scanner.nextInt();

        car.setDetails(brand, model, year);
        car.displayDetails();
    }
}
/*
Output:
Enter car brand: Toyota
Enter car model: Corolla
Enter car manufacturing year: 2020
Car Brand: Toyota
Car Model: Corolla
Manufacturing Year: 2020
 */