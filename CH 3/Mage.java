abstract class Goat {
    private String name;
    protected int health;  // Protected so subclasses can access it

    public Goat(String name) {
        this.name = name;
        this.health = 100;  // Default health
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

    // Abstract attack method to be implemented by subclasses
    public abstract void attack(Goat opponent);

    // Protected takeDamage method
    protected void takeDamage(int damage) {
        health -= damage;
    }
}
