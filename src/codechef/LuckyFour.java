package codechef;

import java.util.Scanner;
/*
https://www.codechef.com/problems/LUCKYFR
 */

public class LuckyFour {
    public static void main(String[] args) {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int a=sc.nextInt();
            int count=0;
            String numString = String.valueOf(a);
            for(int i=0;i<numString.length();i++)
            {
                if(numString.charAt(i)=='4')
                {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
