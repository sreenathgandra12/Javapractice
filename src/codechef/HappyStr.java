package codechef;
import java.util.Scanner;
/*
https://www.codechef.com/problems/HAPPYSTR?tab=ide
 */
public class HappyStr {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int t = scanner.nextInt();
            while(t-- > 0) {
                String s = scanner.next();
                int count=0;
                boolean flag=false;
                for(int i=0;i<s.length()-1;i++)
                {
                    if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
                    {
                        count++;
                        if(count==3)
                        {
                            flag=true;
                            break;
                        }
                    }else{
                        count=0;
                    }
                }
                if(flag)
                {
                    System.out.println("Happy");
                }else{
                    System.out.println("Sad");
                }
            }
        }
}

