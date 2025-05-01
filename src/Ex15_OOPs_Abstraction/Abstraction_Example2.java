package Ex15_OOPs_Abstraction;

public class Abstraction_Example2 {
    public static void main(String[] args) {
        WagonR e1=new WagonR();
        e1.StartEngine();
        e1.StopEngine();
    }
}
abstract class Engine{
    abstract void  StartEngine();
    abstract void StopEngine();

    void Normal(){
        System.out.println("Normal Function");
    }
}

class WagonR extends Engine{

    @Override
    void StartEngine() {
        System.out.println("Starting the car");
    }

    @Override
    void StopEngine() {
        System.out.println("Stoping the car");
    }
    void driver(){
        StartEngine();
        StopEngine();
    }
}