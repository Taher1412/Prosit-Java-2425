public class Animal {
    private String family;
    private String name;
    private int age;
    private boolean isMammal;

    // Default Constructor
    public Animal() {}

    // Parameterized Constructor
    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
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
        return name;
    }

    // toString Method
    @Override
    public String toString() {
        return "Animal{name='" + name + "', family='" + family + "', age=" + age + ", isMammal=" + isMammal + "}";
    }
}
