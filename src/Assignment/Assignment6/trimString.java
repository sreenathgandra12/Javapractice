package Assignment.Assignment6;

import java.util.Scanner;

public class trimString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string :");
        String str = scanner.nextLine();
        String trimmedStr = str.trim();
        System.out.println("The trimmed string is: \"" + trimmedStr + "\"");
    }
}
