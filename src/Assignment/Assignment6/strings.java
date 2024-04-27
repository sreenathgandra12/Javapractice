package Assignment.Assignment6;

import java.util.Scanner;

public class strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first string:");
        String str1 = scanner.nextLine();

        System.out.println("Enter the second string:");
        String str2 = scanner.nextLine();

        int result = str1.compareTo(str2);

        if (result < 0) {
            System.out.println(str1 + " comes before " + str2 + " lexicographically.");
        } else if (result > 0) {
            System.out.println(str1 + " comes after " + str2 + " lexicographically.");
        } else {
            System.out.println(str1 + " and " + str2 + " are lexicographically equal.");
        }
    }
}
