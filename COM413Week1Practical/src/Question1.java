import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter initial:");
        char Initial = scanner.next().charAt(0);

        System.out.print("Enter surname:");
        String Surname = scanner.next();

        System.out.print("Enter Age:");
        int Age = scanner.nextInt();

        System.out.print("Enter Salary:");
        double Salary = scanner.nextDouble();

        System.out.print("Are you employed? (true/false)");
        boolean isEmployed = scanner.nextBoolean();

        System.out.println(Initial + " " + Surname + " is " + Age + " years old, is currently " + (isEmployed ? "employed" : "unemployed") + " and has a salary of £" + Salary + " per year.");
        scanner.close();
    }
}

