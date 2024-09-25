import java.util.Scanner;
public class Question5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first value: ");
        int a = scanner.nextInt();

        System.out.print("Enter second value: ");
        int b = scanner.nextInt();

        System.out.println("Sum: " + (a+b));
        System.out.println("Difference: " + (a-b));
        System.out.println("Product: " + (a*b));
        System.out.println("Quotient: " + (a/b));
    }
}
