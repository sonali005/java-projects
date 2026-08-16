public class Fighter {
    private final String name;
    private final int maximumHP;
    private int currentHP;

    public Fighter(String name) {
        this.name = name;
        this.maximumHP = 150; // Max HP is 150
        this.currentHP = 150; // Starts at full HP
    }

    // Check if Fighter is unconscious
    public boolean isUnconscious() {
        return currentHP == 0;
    }

    // Cleave Attack: 1 hit of 25 physical damage
    public void attack(Fighter target) {
        if (this.isUnconscious()) {
            System.out.println(this.name + " is unconscious and cannot attack!");
            return;
        }

        int damage = 25; // Physical attack
        System.out.println(this.name + " swings a mighty Cleave at " + target.name + "!");
        target.takeDamage(damage, "physical");
    }

    // Taking Damage: Reduces HP but not below 0
    public void takeDamage(int damage, String type) {
        if (this.isUnconscious()) {
            System.out.println(this.name + " is already unconscious and cannot take damage!");
            return;
        }

        if (type.equalsIgnoreCase("magical")) {
            damage *= 1.25; // Magical damage increased by 25%
        } else if (type.equalsIgnoreCase("physical")) {
            damage *= 0.75; // Physical damage reduced by 25%
        }

        currentHP -= damage;
        if (currentHP < 0) {
            currentHP = 0;
        }

        System.out.println(this.name + " takes " + damage + " " + type + " damage! Current HP: " + currentHP);
    }

    // Healing: Cannot exceed max HP
    public void heal(int amount) {
        if (this.isUnconscious()) {
            System.out.println(this.name + " is unconscious and cannot be healed!");
            return;
        }

        currentHP += amount;
        if (currentHP > maximumHP) {
            currentHP = maximumHP;
        }

        System.out.println(this.name + " heals for " + amount + " HP! Current HP: " + currentHP);
    }

    @Override
    public String toString() {
        return "A fighter named " + name + " with " + currentHP + "/" + maximumHP + " hit points!";
    }

    // Main method for testing
    public static void main(String[] args) {
        Fighter fighter1 = new Fighter("Goat Slayer");
        Fighter fighter2 = new Fighter("Stronghoof");

        System.out.println(fighter1);
        System.out.println(fighter2);

        // Fighter1 attacks Fighter2
        fighter1.attack(fighter2);
        System.out.println(fighter2);

        // Fighter2 attacks Fighter1
        fighter2.attack(fighter1);
        System.out.println(fighter1);

        // Fighter2 heals
        fighter2.heal(30);
        System.out.println(fighter2);

        // Fighter1 takes a magical attack (simulate)
        fighter1.takeDamage(40, "magical");
        System.out.println(fighter1);
    }
}
