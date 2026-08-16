public class Attack {
    private String name;
    private int[] noOfhits;
    private DamageType damagetype;

    public Attack(String name, int[] noOfhits, DamageType damagetype) {
        this.name = name;
        this.noOfhits = noOfhits.clone();
        this.damagetype = damagetype;
    }

    public String getName() {
        return name;
    }

    public int[] getNoOfhits() {
        return noOfhits;
    }

    public DamageType getDamagetype() {
        return damagetype;
    }

    
}
