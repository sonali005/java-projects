// Goat.java
public abstract class Goat {
    private String name;
    protected int health = 100;  // Default health for all goats

    public Goat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isConscious() {
        return health > 0;
    }

    public String getStatus() {
        return health + " health remaining";
    }

    // Abstract method for attack (no implementation in base class)
    public abstract void attack(Goat opponent);

    // Abstract method for taking damage (no implementation in base class)
    protected abstract void takeDamage(int damage);
}
