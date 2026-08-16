// PlainGoat.java
public class PlainGoat extends Goat {

    public PlainGoat(String name) {
        super(name);
    }

    @Override
    public void attack(Goat opponent) {
        System.out.println(getName() + " headbutts!");
        opponent.takeDamage(10);  // PlainGoat deals 10 damage
    }

    @Override
    protected void takeDamage(int damage) {
        health -= damage;
        if (health < 0) health = 0;
    }
}
