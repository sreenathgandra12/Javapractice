package Day3.Hybrid;

class GrandFather
{
    public void showG()
    {
        System.out.println("He is grandfather.");
    }
}
//inherits GrandFather properties
class Father extends GrandFather
{
    public void showF()
    {
        System.out.println("He is father.");
    }
}
//inherits Father properties
class Son extends Father
{
    public void showS() {
        System.out.println("He is son.");
    }
}
//inherits Father properties
class Daughter extends Father {
    public void showD() {
        System.out.println("She is daughter.");
    }
}
public class HybridTest {
    public static void main(String[] args) {
        Son obj = new Son();
        obj.showS();
        obj.showF();
        obj.showG();
        Daughter obj2 = new Daughter();
        obj2.showD();
        obj2.showF();
        obj2.showG();
    }
}