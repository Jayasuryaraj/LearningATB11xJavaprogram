package Ex16_OOPs_Abstraction;

public class Abs_Example {
    public static void main(String[] args) {
    C1 class1=new C1();

    }

}
abstract class Employee{
    private int Id;
    private String Name;
    private String Address;

    Employee(){
        System.out.println("DC");
    }
    Employee(int Id, String Name, String Address){
        System.out.println("PC");
        this.Address=Address;
        this.Name=Name;
        this.Id=Id;
    }
    abstract double Computepay();

    void mailcheck()
    {
        System.out.println("User is:" + this.Name+this.Id);
    }
}
class C1 extends Employee{

    @Override
    double Computepay() {
        return 0;
    }
}
