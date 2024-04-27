package codechef;

import java.util.Scanner;
/*
https://www.codechef.com/problems/ZOOZ
 */
public class ZeroOnes {
    public static void main(String[] args) {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0)
        {
            int n=sc.nextInt();
            String a="";
            if(n%2!=0)
            {
                for(int i=0;i<n;i++)
                {
                    if(i%2==0)
                        a=a+"0";
                    else
                        a=a+"1";
                }

            }
            else
            {
                a=a+"1";
                for(int i=0;i<n-2;i++)
                {
                    a=a+"0";
                }
                a=a+"1";
            }
            System.out.println(a);
        }
    }
}
