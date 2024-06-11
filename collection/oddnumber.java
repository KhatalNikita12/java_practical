import java.util.LinkedList;
import java.util.Scanner;

public class oddnumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept n integers from the user
        System.out.print("Enter the number of integers: ");
        int n = scanner.nextInt();

        LinkedList<Integer> numbers = new LinkedList();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            int num = scanner.nextInt();
            numbers.add(num);
        }

        // Display only even numbers
        LinkedList<Integer> evenNumbers = new LinkedList();
        for (int num : numbers) {
            if (num % 2 != 0) {
                evenNumbers.add(num);
            }
        }

        // Print the entered numbers
        System.out.print("Entered numbers: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Print the even numbers
        System.out.print("Even numbers: ");
        for (int num : evenNumbers) {
            System.out.print(num + " ");
        }
    }
}
