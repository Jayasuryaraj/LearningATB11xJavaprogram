package Ex18_Inheritance_with_Interface;

public class Ex_Interface {
    public static void main(String[] args) {
        Son c1=new Son();
        c1.money();
    }
}
interface Mother{
    void money();
}
interface Father{
    void money();
}
class Son implements Mother, Father{

    @Override
    public void money() {
        System.out.println("Child Money");
    }
}