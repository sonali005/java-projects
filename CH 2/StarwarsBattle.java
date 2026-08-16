

public class StarwarsBattle {
    public static void main(String[] args) {
        Weapon myWeapon = new Weapon(); /*It allows you to use myWeapon to access the fields and methods of the Weapon class. */
        myWeapon.name = "Lightsaber";
        myWeapon.damage = 100;

        System.out.println("Weapon name = " + myWeapon.name);
        System.out.println("Damage = " + myWeapon.damage);
    }
}
