// Author:          Ciaran Whyte
// Student Number:  C00273862

public class Animal {
    // Variables.
    private String type;
    private int age;
    private char gender;

    // Initialize variables.
    public Animal(String type, int age, char gender) {
        this.type = type;
        this.age = age;
        this.gender = gender;
    }

    // Methods.
    public void eat() {
        System.out.println("The Animal is eating");
    }

    public void sleep() {
        System.out.println("The Animal is sleeping");
    }

    public void makeSound() {
        System.out.println("A generic animal sound");
    }

    // toString
    @Override
    public String toString() {
        return "|  Type = " + type + "  |  Age = " + age + "  |  Gender = " + gender + "  |";
    }
}