
import java.util.*;

public class AlexCalculator {

    private static int add(int a, int b) {
        return a + b;
    }

    private static int multiply(int a, int b) {
        System.out.println("Testing Multiplication : ");
        int sum = 0;
        for (int i = 1; i < b; i++) {

            System.out.println("Adding integers: " + (sum += a) + "  " + a);
        }
        sum = sum + a;
        System.out.println("Product: " + sum);
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();
        System.out.println("Testing Addition :");
        System.out.println("Adding Integers : " + a + " " + b);
        System.out.println("Sum: " + add(a, b));
        multiply(a, b);
    }
}
