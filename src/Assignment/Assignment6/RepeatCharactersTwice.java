package Assignment.Assignment6;

import java.util.Scanner;

public class RepeatCharactersTwice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = scanner.nextLine();
        String doubledStr = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            doubledStr += c;
            doubledStr += c;
        }
        System.out.println("The new string with every character repeated twice is: \"" + doubledStr + "\"");
    }
}
