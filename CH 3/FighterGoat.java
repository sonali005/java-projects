// FighterGoat.java
public class FighterGoat extends Goat {

    public FighterGoat(String name) {
        super(name);
    }

    @Override
    public void attack(Goat opponent) {
        System.out.println(getName() + " punches with strength!");
        opponent.takeDamage(15);  // FighterGoat deals 15 damage
    }

    @Override
    protected void takeDamage(int damage) {
        health -= damage;
        if (health < 0) health = 0;
    }
}
