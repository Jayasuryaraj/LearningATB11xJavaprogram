package Ex14_OOPs_Abstraction;

public class Abtraction_Handson {
    public static void main(String[] args) {
        Son s1= new Son();
        s1.loan25K();
        s1.loan50k();
    }
}
abstract class Father{
   abstract void loan50k();

   void loan25K(){
        System.out.println("Given 25k");
    }
}
class Son extends Father{
    @Override
    void loan50k() {
        System.out.println("Child will pay the loan");
    }
}
