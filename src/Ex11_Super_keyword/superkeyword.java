package Ex11_Super_keyword;

public class superkeyword {
    public static void main(String[] args) {
   // Car c1 = new Car(100);
//c1.display();
    }
}
class Vehicle{
      public int speed=200;

      Vehicle (){
          System.out.println("Default Constructor");
      }
      Vehicle (int a){
          System.out.println("Parameterized Cons");
      }
      void message(){
          System.out.println("No return, No Argument");
      }
      void message(int a){
          System.out.println("PC- argument");
      }
      void display(){
          System.out.println("Vehicle-parent");
      }
}

class Car extends Vehicle{
    private int speed=300;

    Car(){
        super();
    }
    Car(int a){
       super(10);
            }
     @Override
    void display(){
         System.out.println(this.speed);
         System.out.println(super.speed);
         System.out.println("Car_child");
         super.message();
         super.message(10);
         super.display();

     }
}

