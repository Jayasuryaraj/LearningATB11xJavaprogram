package ex_01_Java_Basic;

public class Ex_6TypeCasting {
    public static void main(String[] args) {
        int lab1= 100;
        float lab2= 200f;
        //float total=lab1+lab2 Narrow Implicit not possible
        int lab3= lab1+(int)lab2; // Narrow Explicit
        System.out.println(lab3);
        float lab4= (float)lab1+lab2;
        System.out.println(lab4);
    }
}
