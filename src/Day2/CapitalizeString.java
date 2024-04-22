package Day2;
import java.util.Scanner;
public class CapitalizeString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();
        String capitalized = capitalizeString(input);
        System.out.println("Capitalized string: " + capitalized);
    }
    public static String capitalizeString(String string) {
        if (string == null || string.isEmpty()) {
            return "";
        }
        char[] chars = string.toCharArray();
        boolean capitalizeNext = true;

        for (int i = 0; i < chars.length; i++) {
            if (Character.isWhitespace(chars[i]) || chars[i] == '.' || chars[i] == '\'') {
                capitalizeNext = true;
            } else if (capitalizeNext && Character.isLetter(chars[i])) {
                chars[i] = Character.toUpperCase(chars[i]);
                capitalizeNext = false;
            }
        }
        return String.valueOf(chars);
    }
}
