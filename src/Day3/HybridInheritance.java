package Day3;


class C
{
    public void disp()
    {
        System.out.println("C");
    }
}

class A extends C
{
    public void disp()
    {
        System.out.println("A");
    }
}

class B extends C
{
    public void disp()
    {
        System.out.println("B");
    }

}

class D extends A {
    public void disp() {
        System.out.println("D");
    }
}

public class HybridInheritance {
    public static void main(String[] args) {
        D obj =new D();
        obj.disp();
        B obj1 =new B();
        obj1.disp();
    }
}
