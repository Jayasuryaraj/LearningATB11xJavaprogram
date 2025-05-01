package Ex19_IIB;

public class IIB {
    public static void main(String[] args) {
        new A();
        //Instance Intilization Block- IIB
    }
}
class A {
    //DC
    A(){
        System.out.println("Default Constructor");
    }
    //IIB. Once Object is created, it will run IIB only, then only it will run DC
    {
        System.out.println("This is IIB");
    }
    {
        System.out.println("This is IIB-1");
    }
    {
        System.out.println("This is IIB-2");
    }
    {
        System.out.println("This is IIB-3");
    }
}
