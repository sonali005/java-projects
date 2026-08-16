public class GoatArena {

    // Generic battle method that accepts any type of Goat (Mage, Fighter, Warrior, etc.)
    public static void battle(Goat goat1, Goat goat2) {
        System.out.println(goat1.getName() + " vs. " + goat2.getName() + " - LET THE BATTLE BEGIN!");

        // Continue battling while both goats are conscious
        while (goat1.isConscious() && goat2.isConscious()) {
            // Goat1 attacks Goat2
            goat1.attack(goat2);
            System.out.println(goat2.getName() + " Status: " + goat2.getStatus());

            // If Goat2 is still conscious, Goat2 attacks Goat1
            if (goat2.isConscious()) {
                goat2.attack(goat1);
                System.out.println(goat1.getName() + " Status: " + goat1.getStatus());
            }
        }

        // Declare the winner based on who is still conscious
        if (goat1.isConscious()) {
            System.out.println(goat1.getName() + " wins the battle!");
        } else {
            System.out.println(goat2.getName() + " wins the battle!");
        }

        System.out.println("\n--------------------------------\n");
    }

    // main method to test the battle
    public static void main(String[] args) {
        // Create a variety of goats (MageGoat, FighterGoat, PlainGoat, etc.)
        Goat mageGoat = new MageGoat("Mage Goat");
        Goat fighterGoat = new FighterGoat("Fighter Goat");
        Goat plainGoat1 = new PlainGoat("Plain Goat 1");
        Goat plainGoat2 = new PlainGoat("Plain Goat 2");

        // Test different combinations of goats fighting each other
        battle(mageGoat, fighterGoat);  // Mage vs. Fighter
        battle(fighterGoat, plainGoat1);  // Fighter vs. Plain
        battle(plainGoat2, mageGoat);  // Plain vs. Mage
        battle(fighterGoat, new FighterGoat("Fighter Goat 2"));  // Two Fighters
    }
}
