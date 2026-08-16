public class Shipoutput {
    public static void main(String[] args) {
        Ship myShip = new Ship("The Pam", 200);

        System.out.println("Ship name: " + myShip.getName());
        System.out.println("Ship's hullrate: " + myShip.getHullrate());
        System.out.println("Ship's hullamount: " + myShip.getHullamount());
    }
}
