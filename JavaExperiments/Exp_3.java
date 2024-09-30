// Experiment-3.
//Objective: To develop the ability of converting real time entity into objects and create their classes.
class Car {
    String color;
    String model;
    int year;

    Car(String color, String model, int year) {
        this.color = color;
        this.model = model;
        this.year = year;
    }

    void displayInfo() {
        System.out.println("Car Model: " + model);
        System.out.println("Car Color: " + color);
        System.out.println("Car Year: " + year);
    }
}

public class Exp_3 {
    public static void main(String[] args) {
        Car car1 = new Car("Red", "Toyota", 2020);
        Car car2 = new Car("Blue", "Honda", 2021);

        car1.displayInfo();
        System.out.println();
        car2.displayInfo();
    }
}
/*
 OUtput:
 Car Model: Toyota
Car Color: Red
Car Year: 2020

Car Model: Honda
Car Color: Blue
Car Year: 2021
 */