package Day4.Exceptions;

public class tryMutipleCatch {
    public static void main(String[] args) {
        try{
            int a[]=new int[5];
            System.out.println(a[10]);
        }
        catch (ArithmeticException e)
        {
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e1)
        {
            System.out.println("ArrayIndexOutOfBoundsException");
        }
        catch (Exception e)
        {
            System.out.println("Exception Occurs");
        }
    }

}
