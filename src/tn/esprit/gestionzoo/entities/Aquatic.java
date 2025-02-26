package tn.esprit.gestionzoo.entities;

public abstract class Aquatic extends Animal {
    protected String habitat;

    public Aquatic() {
    }

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    public String getHabitat() {
        return this.habitat;
    }

    @Override
    public String toString() {
        return super.toString() + ", habitat=" + habitat;
    }

    public abstract void swim();

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;

        Aquatic aquatic = (Aquatic) obj;

        return this.getName().equals(aquatic.getName()) &&
                this.getAge() == aquatic.getAge()
                && this.getHabitat() == aquatic.getHabitat();
    }
}
