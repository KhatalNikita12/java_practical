import java.util.Scanner;

public class d {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
            System.out.print("Enter the value of n: ");
            int n = input.nextInt();
           int[] numbers = new int[n]; // Array to store the input numbers
            int[] perfectNumbers = new int[n]; // Array to store perfect numbers
            int perfectCount = 0; // Counter for perfect numbers
          
            System.out.println("Enter " + n + " numbers:");
            for (int i = 0; i < n; i++) {
                numbers[i] = input.nextInt();
            }
      
            for (int i = 0; i < n; i++) {
                if (isPerfect(numbers[i])) {
                    perfectNumbers[perfectCount] = numbers[i];
                    perfectCount++;
                }
            }
            
            // Display the perfect numbers stored in the array
            if (perfectCount > 0) {
                System.out.println("Perfect numbers:");
                for (int i = 0; i < perfectCount; i++) {
                    System.out.print(perfectNumbers[i] + " ");
                }
                System.out.println(); // Add a line break for better formatting
            } else {
                System.out.println("No perfect numbers found.");
            }
            
            // Ask the user if they want to continue
           
        }
        
       
        
    // Function to check if a number is perfect
   // Function to check if a number is perfect
public static boolean isPerfect(int num) {
   

    int sum = 1; // Initialize with 1 as all numbers are divisible by 1
    for (int i = 2; i <= num / 2; i++) {
        if (num % i == 0) {
            sum += i;
        }
    }

    return sum == num;
}
}

