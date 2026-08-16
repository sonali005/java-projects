import java.util.Scanner;

public class HelloScanner{
    public static void helloYou() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");

        String name = scanner.nextLine();
        System.out.println("Hello " + name + "!");
        scanner.close();
    }

    public static void main(String[] args) {
        helloYou();
    }

}


