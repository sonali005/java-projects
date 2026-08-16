public class GoatArena {
    public static void battle(Mage mage, Fighter fighter) {
        // Battle continues until one of the goats is unconscious (HP == 0)
        while (!mage.isUnconscious() && !fighter.isUnconscious()) {
            System.out.println("\n--- Round Start ---");

            // Mage attacks Fighter
            mage.attack(fighter);
            System.out.println(fighter);

            // Fighter attacks Mage
            fighter.attack(mage);
            System.out.println(mage);
            
            System.out.println("--- Round End ---\n");
        }

        // Determine the winner
        if (mage.isUnconscious()) {
            System.out.println(mage + " has fallen! " + fighter + " wins the battle!");
        } else {
            System.out.println(fighter + " has fallen! " + mage + " wins the battle!");
        }
    }

    // Main method to test the battle
    public static void main(String[] args) {
        Mage mage = new Mage("Hairy Potter");
        Fighter fighter = new Fighter("Goat the Barbarian");

        // Start the epic battle
        battle(mage, fighter);
    }
}
