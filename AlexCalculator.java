
import java.util.*;

public class AlexCalculator {

    private static int add(int a, int b) {
        return a + b;
    }

    private static int multiply(int a, int b) {
        int result = 0;
        for (int i = 0; i < b; i++) {
            result = result + a;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();
        System.out.println("Testing Addition :");
        System.out.println("Adding Integers : " + a + b);
        System.out.println("Sum: " + add(a, b));
        System.out.println("The result is : " + multiply(a, b));

    }
}
