// Author:          Ciaran Whyte

public class Cat extends Animal {
    // Assigning values to the variables.
    public Cat(String type, int age, char gender) {
        super(type, age, gender);
    }

    // Methods.
    @Override // Overrides makeSound to print out the Cat noise.
    public void makeSound() {
        System.out.println("Prrrr");
    }
}
