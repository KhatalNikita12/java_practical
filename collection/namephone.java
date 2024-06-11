
import java.util.Hashtable;
import java.util.Scanner;

public class namephone {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Hashtable<String, String> studentInfo = new Hashtable<>();

        // Adding information for the first student
        System.out.print("Enter name for Student 1: ");
        String name1 = input.nextLine();
        System.out.print("Enter phone number for Student 1: ");
        String phoneNumber1 = input.nextLine();
        studentInfo.put(name1, phoneNumber1);

        // Adding information for the second student
        System.out.print("Enter name for Student 2: ");
        String name2 = input.nextLine();
        System.out.print("Enter phone number for Student 2: ");
        String phoneNumber2 = input.nextLine();
        studentInfo.put(name2, phoneNumber2);

        // Displaying information
        System.out.println("\nStudent Information:");
        for (String name : studentInfo.keySet()) {
            String phoneNumber = studentInfo.get(name);
            System.out.println("Name: " + name + ", Phone Number: " + phoneNumber);
        }
    }
}
