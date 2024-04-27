package Assignment.Assignment6;

import java.util.Scanner;

public class stringContentsChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the main string:");
        String mainString = scanner.nextLine();

        System.out.println("Enter the prefix string:");
        String prefixString = scanner.nextLine();

        if (mainString.startsWith(prefixString)) {
            System.out.println("The main string starts with the prefix string.");
        } else {
            System.out.println("The main string does not start with the prefix string.");
        }
    }
}