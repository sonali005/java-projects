public class Ship {
    private String name;
    private int hullrate;
    private int hullamount;

    // Constructor
    public Ship(String name, int hullrate) {
        this.name = name;
        this.hullrate = hullrate;
        this.hullamount = hullrate * 10;  // Example calculation
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getHullrate() {
        return hullrate;
    }

    public int getHullamount() {
        return hullamount;
    }
}

