package Day1;

public class Factorial {
    static int fact(int n)
    {
        if(n==0)
            return 1;
        return n*fact(n-1);

    }
    public static void main(String[] args) {
        int a=5;
        System.out.println(fact(5));
    }
}

/*
 int i,fact=1;
  int number=5;
  for(i=1;i<=number;i++){
      fact=fact*i;
  }
  System.out.println("Factorial of "+number+" is: "+fact);
 }
 */