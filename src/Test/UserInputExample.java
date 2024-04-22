package Test;

import java.util.Scanner;

public class UserInputExample{
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt(); // Read the integer input

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        scanner.nextLine(); // Consume the newline character left by nextInt()
        String str = scanner.nextLine(); // Read the string input

        // Display the inputs provided by the user
        System.out.println("You entered the integer: " + num);
        System.out.println("You entered the string: " + str);

        // Close the scanner to release resources
        scanner.close();
    }
}
