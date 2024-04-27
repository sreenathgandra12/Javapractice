package codechef;
/*
https://www.codechef.com/problems/SLOWSOLN
 */
import java.util.Scanner;

public class SlowSolution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int maxT=sc.nextInt();
            int maxM=sc.nextInt();
            int sumN=sc.nextInt();
            int sum=0;
            for(int i=0;i<maxT;i++)
            {
                if(sumN==0)
                    break;
                if(maxM<sumN)
                {
                    sum+=(maxM*maxM);
                    sumN=sumN-maxM;
                }else
                {
                    sum+=(sumN*sumN);
                    sumN=0;
                }
            }
            System.out.println(sum);
        }

    }
}
