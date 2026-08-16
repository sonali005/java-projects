public enum Boilingpoint {
    CELCIUS('C', 100f),
    FAREHEIT('F', 232f),
    KELVIN('K', 373.5f);

    private char scale;
    private float degrees;

    private Boilingpoint(char scale, float degrees) {
        this.scale = scale;
        this.degrees = degrees;
    }

    public char getScale() {
        return scale;
    }

    public float getDegrees() {
        return degrees;
    }

}
