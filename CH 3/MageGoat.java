// MageGoat.java
public class MageGoat extends Goat {

    public MageGoat(String name) {
        super(name);  // Call the parent constructor
    }

    @Override
    public void attack(Goat opponent) {
        System.out.println(getName() + " casts a spell!");
        opponent.takeDamage(20);  // MageGoat deals 20 damage
    }

    @Override
    protected void takeDamage(int damage) {
        health -= damage;
        if (health < 0) health = 0;
    }
}
