import java.util.Scanner;

public class Quadratic {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a: ");
        int a = sc.nextInt();
        System.out.println("enter the value of b: ");
        int b = sc.nextInt();
        System.out.println("enter the value of c: ");
        int c = sc.nextInt();

        int delta = (b * b - 4 * a * c);

        double rootOne = (-b + Math.sqrt(delta)) / (2 * a);
        double rootTwo = (-b - Math.sqrt(delta)) / (2 * a);
        System.out.println("Roots of x: " + rootOne + " and " + rootTwo);

    }
}
