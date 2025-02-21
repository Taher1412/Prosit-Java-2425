package tn.esprit.gestionzoo.entities;

public class Animal {
    protected String family;
    protected String name;
    protected int age;
    protected boolean isMammal;

    // Default Constructor
    Animal() {
    }

    // Parameterized Constructor
    public Animal(String family, String name, int age, boolean isMammal) {
        if (age > 0) {
            this.age = age;
        }
        this.family = family;
        this.name = name;
        this.isMammal = isMammal;
    }

    // Display Animal Info
    public void displayAnimal() {
        System.out.println("\tName: " + name);
        System.out.println("\tAge: " + age);
        System.out.println("\tFamily: " + family);
        System.out.println("\tMammal: " + (isMammal ? "Yes" : "No"));
    }

    // Getters
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    // Setter for age
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    
    // toString Method
    @Override
    public String toString() {
        return "Animal{name='" + name + "', family='" + family + "', age=" + age + ", isMammal=" + isMammal + "}";
    }
}
