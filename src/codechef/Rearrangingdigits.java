package codechef;

import java.util.Scanner;
/*
https://www.codechef.com/problems/DIGARR
 */

public class Rearrangingdigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int D = sc.nextInt();
            String N = sc.next();
            boolean flag=false;
            for(int i=0;i<D;i++)
            {
                if(N.charAt(i)=='0'||N.charAt(i)=='5')
                {
                    flag=true;
                }
            }
            if(flag)
            {
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}
