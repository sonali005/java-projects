
public class Conditional {

    public static void evenlyDivisble(int n) {
        if (n%2 == 0){
            System.out.println("This number is even");
        } else if(n%3 == 0){
            System.out.println("This number is divisble by 3");
        } else if(n%5 == 0){
            System.out.println("This number is divisble by 5");
        } else {
            System.out.println("The number is odd but not divisible by 3 or 5");
        }
    }

    public static void main(String[] args) {
        evenlyDivisble(10);
    }
    
}



