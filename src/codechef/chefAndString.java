package codechef;

import java.util.Scanner;

/*
https://www.codechef.com/problems/RECNDSTR
 */
public class chefAndString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            String s=sc.next();
            String l="",r="";
            l=s.substring(1,s.length())+s.substring(0,1);
            r=s.substring(s.length()-1)+s.substring(0,s.length()-1);
            if(l.equals(r))
            {
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }

    }

}
