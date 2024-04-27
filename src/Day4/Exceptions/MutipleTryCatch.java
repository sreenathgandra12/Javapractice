package Day4.Exceptions;

public class MutipleTryCatch {
    public static void main(String[] args) {
        try {
            int a=2/0;
        }
        catch (ArithmeticException e)
        {
            System.out.println(e);
        }
        try {
            String s=null;
            int l=s.length();
        }
        catch (NullPointerException n)
        {
            System.out.println(n);
        }
    }

}
