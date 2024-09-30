// Experiment-8
// Objective: Ability to design a base and child class relationship to increase reusability.
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class Exp_8 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.bark();
    }
}
/*
Output:
This animal eats food.
The dog barks.
 */