import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("My first program");
        System.out.println("Paramter 1: " + args[0]);
        System.out.println("Paramter 2: " + args[1]);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first number: ");
        int a = scanner.nextInt();
        System.out.print("Input second number: ");
        int b = scanner.nextInt();

        int sum = a + b;
        System.out.println("Summa: " + sum);

        String str = scanner.nextLine();
    }
}
