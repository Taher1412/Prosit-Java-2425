package tn.esprit.gestionzoo.entities;

public class Zoo {
    private Animal[] animals;
    private String name;
    private String city;
    private final int nbrCages = 25;
    private int animalCount = 0;
    private Aquatic[] aquaticAnimals;
    private final int nbrAquatic = 10;
    private int aquaticCount = 0;

    // Constructor
    public Zoo(String name, String city) {
        if (!name.isEmpty()) {
            this.name = name;
        }

        this.city = city;
        this.animals = new Animal[nbrCages];
        this.aquaticAnimals = new Aquatic[nbrAquatic];
    }

    // Display Zoo Info
    public void displayZoo() {
        System.out.println("Zoo Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Number of Cages: " + nbrCages);
    }

    public void setName(String name) {
        if (!name.isEmpty()) {
            this.name = name;
        }
    }

    public Aquatic[] getAquaticAnimals() {
        return aquaticAnimals;
    }

    @Override
    public String toString() {
        return "Zoo{" + "name='" + name + '\'' + ", city='" + city + '\'' + ", nbrCages=" + nbrCages + '}';
    }

    // Add an animal
    public boolean addAnimal(Animal animal) {
        if (isZooFull()) {
            System.out.println("Zoo is full!");
            return false;
        }
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].getName().equals(animal.getName())) {
                System.out.println("Animal already exists!");
                return false;
            }
        }
        animals[animalCount++] = animal;
        return true;
    }

    // Search for an animal
    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].getName().equals(animal.getName())) {
                return i;
            }
        }
        return -1;
    }

    // Remove an animal
    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index == -1)
            return false;

        for (int i = index; i < animalCount - 1; i++) {
            animals[i] = animals[i + 1];
        }
        animals[--animalCount] = null;
        return true;
    }

    // Display all animals in the zoo
    public void displayAnimals() {
        System.out.println("Animals in " + name + ":");
        for (int i = 0; i < animalCount; i++) {
            System.out.println(animals[i]);
        }
    }

    // Check if the zoo is full
    public boolean isZooFull() {
        return animalCount >= nbrCages;
    }

    // Compare two zoos and return the one with more animals
    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        return z1.animalCount > z2.animalCount ? z1 : z2;
    }

    public void addAquaticAnimal(Aquatic aquatic) {
        if (aquaticCount >= nbrAquatic) {
            System.out.println("Zoo is full!");
            return;
        }
        for (int i = 0; i < aquaticCount; i++) {
            if (aquaticAnimals[i].getName().equals(aquatic.getName())) {
                System.out.println("Aquatic animal already exists!");
                return;
            }
        }
    }

    public float maxPenguinSwimmingDepth() {
        float max = 0;
        for (int i = 0; i < aquaticCount; i++) {
            if (aquaticAnimals[i] instanceof Penguin) {
                Penguin penguin = (Penguin) aquaticAnimals[i];
                if (penguin.getSwimmingDepth() > max) {
                    max = penguin.getSwimmingDepth();
                }
            }
        }
        return max;
    }

    public void displayNumberOfAquaticsByType() {
        int dolphinCount = 0;
        int penguinCount = 0;
        for (int i = 0; i < aquaticCount; i++) {
            if (aquaticAnimals[i] instanceof Dolphin) {
                dolphinCount++;
            } else if (aquaticAnimals[i] instanceof Penguin) {
                penguinCount++;
            }
        }
        System.out.println("Number of Dolphins: " + dolphinCount);
        System.out.println("Number of Penguins: " + penguinCount);
    }
}