package online.Assignment24;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            int N = scanner.nextInt();
            String S = scanner.next();
            System.out.println(binaryToDecimal(S));
        }
        scanner.close();
    }

    public static int binaryToDecimal(String S) {
        int decimal = 0;
        int base = 1;
        for (int i = S.length() - 1; i >= 0; i--) {
            if (S.charAt(i) == '1') {
                decimal += base;
            }
            base *= 2;
        }
        return decimal;
    }
}
