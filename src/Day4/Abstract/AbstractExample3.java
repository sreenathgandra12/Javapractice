package Day4.Abstract;

abstract class Bike{
    Bike()
    {System.out.println("bike is created");}
    abstract void run();
    void changeGear(){System.out.println("gear changed");}
}
class Honda extends Bike{
    void run(){System.out.println("Honda running safely..");}
}
class Pulsar extends Bike{
    @Override
    void run() {
        System.out.println("pulsar running safely...");
    }
}
public class AbstractExample3 {
    public static void main(String args[]) {
        Bike obj = new Honda();
        obj.run();
        obj.changeGear();
        Bike obj2=new Pulsar();
        obj2.run();
    }
}
