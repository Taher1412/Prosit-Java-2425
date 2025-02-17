package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Zoo;
import tn.esprit.gestionzoo.entities.Animal;
import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String seperator = "*************************************************************";

        // Ask User for Zoo Details
        System.out.print("Enter zoo name: ");
        String zooName = scanner.nextLine();

        System.out.print("Enter city: ");
        String city = scanner.nextLine();

        Zoo myZoo = new Zoo(zooName, city);

        System.out.println(seperator);
        // Display Zoo Information
        myZoo.displayZoo();
        System.out.println(myZoo.toString());

        System.out.println(seperator);
        // Creating and Adding Animals
        Animal lion = new Animal("Cats", "Simba", 18, true);
        Animal dog = new Animal("Dogs", "Rex", 5, true);
        Animal elephant = new Animal("Elephants", "Dumbo", 10, true);
        Animal lion_duplique = new Animal("Cats", "Simba", 20, true);

        System.out.println(seperator);
        // Adding Animals
        myZoo.addAnimal(lion);
        myZoo.addAnimal(dog);
        myZoo.addAnimal(elephant);
        myZoo.addAnimal(lion_duplique);

        System.out.println(seperator);
        // Display Animals in Zoo
        myZoo.displayAnimals();

        System.out.println(seperator);
        // Searching for an Animal
        int index = myZoo.searchAnimal(new Animal("Dogs", "Rex", 5, true));
        if (index != -1) {
            System.out.println("Animal 'Rex' found at index: " + index);
        } else {
            System.out.println("Animal 'Rex' not found.");
        }

        System.out.println(seperator);
        // Removing an Animal
        boolean removed = myZoo.removeAnimal(lion);
        if (removed) {
            System.out.println("Simba a ete supprime");
        }

        System.out.println(seperator);
        // Display Animals After Removal
        myZoo.displayAnimals();

        // Close Scanner
        scanner.close();
    }
}
