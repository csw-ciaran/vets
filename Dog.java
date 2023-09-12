// Author:          Ciaran Whyte

public class Dog extends Animal {
    // Assigning values to the variables.
    public Dog(String type, int age, char gender) {
        super(type, age, gender);
    }

    // Methods.
    @Override // Overrides makeSound to print out the Dog noise.
    public void makeSound() {
        System.out.println("Woof woof");
    }
}
