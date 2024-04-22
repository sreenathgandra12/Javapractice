package Day2;

import java.util.Scanner;

public class CountChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        scanner.close();
        getOccurringChar(str);
    }
    static void getOccurringChar(String str) {
        int len = str.length();
        int count[] = new int[256];

        for (int i = 0; i < len; i++) {
            if (str.charAt(i) != ' ')
                count[str.charAt(i)]++;
        }
        char ch[] = new char[str.length()];
        for (int i = 0; i < len; i++) {
            ch[i] = str.charAt(i);
            int find = 0;
            for (int j = 0; j <= i; j++) {
                if (str.charAt(i) == ch[j])
                    find++;
            }
            if (find == 1 && str.charAt(i) != ' ')
                System.out.println("The occurrence of " + str.charAt(i) + " is: " + count[str.charAt(i)]);
        }
    }
}
