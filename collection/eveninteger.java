import java.util.ArrayList;
import java.util.Scanner;

public class eveninteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();

        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter " + N + " integers:");

        for (int i = 0; i < N; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            int num = scanner.nextInt();
            numbers.add(num);
        }

        System.out.println("Even integers:");

        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
    }
}