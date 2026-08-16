
public class Calculon {

    public static float add(float a, float b) {
        return a+b;
    }

    public static float subtract(float a, float b) {
        return a-b;
    }

    public static float multiply(float a, float b) {
        return a*b;
    }

    public static void main(String[] args) {
        System.out.println("Addition = " + add(5.5f, 0.5f));
        System.out.println("Subtraction = " + subtract(5.0f,1.0f));
        System.out.println("Multiplication = " + multiply(2.0f, 4.0f));
    }
    
}

