package Day4.Abstract;



abstract class Bank{
    abstract int getRateOfInterest();
}
class SBI extends Bank{
    int getRateOfInterest(){return 7;}
}
class PNB extends Bank{
    int getRateOfInterest(){return 8;}
}
class UnionBank extends Bank{

    @Override
    int getRateOfInterest() {
        return 14;
    }
}



public class AbstractExample2 {
    public static void main(String args[]){
        Bank b=new SBI();
        System.out.println("Rate of SBI Interest is: "+b.getRateOfInterest()+" %");
        Bank b1=new PNB();
        System.out.println("Rate of PNB Interest is: "+b1.getRateOfInterest()+" %");
        Bank b2=new UnionBank();
        System.out.println("Rate of Union bank Interest is: "+b2.getRateOfInterest()+" %");

    }

}
