// Author:          Ciaran Whyte

public class Vet {
    // Variables.
    private String name;

    // Initialize Variables.
    public Vet(String name) {
        this.name = name;
    }

    // Methods.
    public void vaccinate(Animal animal) {
        System.out.println(this.name + " has completed a Vaccination.");

        if (animal instanceof Dog) { // Cast animal to Dog
            System.out.println("Dog that has been vaccinated: ");
            System.out.println(animal);
        } else if (animal instanceof Cat) { // Cast animal to Cat
            System.out.println("Cat that has been vaccinated: ");
            System.out.println(animal);
        }
    }
}
