package codechef;

import java.util.Scanner;
/*
https://www.codechef.com/problems/BLITZ3_2
 */

public class ChessMatch {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int T=scanner.nextInt();
        while(T-->0)
        {
            int n = scanner.nextInt();
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int e=2*(180+n);
            int f=a+b;
            int result=e-f;
            System.out.println(result);
        }
    }
}
