// Author:          Ciaran Whyte
// Student Number:  C00273862

public class AnimalTest {
    public static void main(String args[]) {
        Animal dog = new Dog("Poodle", 4, 'M');
        System.out.println(dog);
        dog.eat();
        dog.sleep();
        dog.makeSound();

        System.out.println();

        Animal cat = new Cat("Tom", 2, 'F');
        System.out.println(cat);
        cat.eat();
        cat.sleep();
        cat.makeSound();

        System.out.println();

        Vet vet = new Vet("Dr. Whyte");
        vet.vaccinate(dog); // "Name" vaccinates dog
        System.out.println();
        vet.vaccinate(cat); // "Name" vaccinates cat
        System.out.println();

        System.out.println();
    }
}