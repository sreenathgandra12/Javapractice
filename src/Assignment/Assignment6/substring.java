package Assignment.Assignment6;

import java.util.Scanner;

public class substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = scanner.nextLine();
        System.out.println("Enter the start position:");
        int start = scanner.nextInt();
        System.out.println("Enter the end position:");
        int end = scanner.nextInt();
        String substring = str.substring(start, end);
        System.out.println("The substring from position " + start + " to position " + end + " is: " + substring);
    }
}
