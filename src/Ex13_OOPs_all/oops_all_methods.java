package Ex13_OOPs_all;

public class oops_all_methods {
    public static void main(String[] args) {
        Bike b1=new Duke();
        b1.display();
        //Even though I defined an overridden display() method in the Duke class,
        // I am not using a Duke object, so that method is never called. That's why i am using Duke object

    }
}

    class Bike{
String color="Yellow";
        void display(){
            System.out.println("Parent class");
 }
}

class Duke extends Bike{
    String color="Red";

@Override
void display(){
    System.out.println(this.color);
    System.out.println(super.color);
}}