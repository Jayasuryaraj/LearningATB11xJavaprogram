package Ex11_Super_handson2;

public class SupervsThis {
    public static void main(String[] args) {
        Dog d= new Dog();
        d.display();
    }

}

class Animal {
    protected  String color  = "white";

    }

class Dog extends Animal{

    private String color  = "Black";



    void display(){
        System.out.println(this.color);
        System.out.println(super.color);
      }

}