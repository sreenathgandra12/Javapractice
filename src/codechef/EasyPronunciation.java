package codechef;
/*
https://www.codechef.com/problems/EZSPEAK
 */
import java.util.Scanner;

public class EasyPronunciation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0)
        {
            int n=sc.nextInt();
            String s=sc.next();
            int count=0;
            boolean flag=false;
            for(int i=0;i<n;i++)
            {
                if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
                {
                    count=0;
                }else
                {
                    count++;
                    if(count==4)
                    {
                        flag=true;
                    }
                }
            }
            if(flag)
            {
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }


    }
}
