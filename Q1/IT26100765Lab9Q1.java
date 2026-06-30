import java.util.Scanner;

public class IT26100765Lab9Q1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double a, b, c;
        double discriminant, root1, root2;

        System.out.print("Enter value a: ");
        a = input.nextDouble();

        System.out.print("Enter value b: ");
        b = input.nextDouble();

        System.out.print("Enter value c: ");
        c = input.nextDouble();

        discriminant = Math.pow(b, 2) - (4 * a * c);

        if (discriminant > 0) {
            root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            System.out.println("\nRoots are real and different:");
            System.out.printf("Root 1: %.2f\n", root1);
            System.out.printf("Root 2: %.2f\n", root2);

        } else if (discriminant == 0) {
            root1 = -b / (2 * a);

            System.out.println("\nRoots are real and equal:");
            System.out.printf("Root 1 = Root 2 = %.2f\n", root1);

        } else {
            System.out.println("\nRoots are imaginary (complex).");
        }

       
    }
}