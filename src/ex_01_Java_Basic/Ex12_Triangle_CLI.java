package ex_01_Java_Basic;

public class Ex12_Triangle_CLI {
    public static void main(String[] args) {
        String side1 = args[0];
        String side2 = args[1];
        String side3 = args[2];

        if (side1 == side2 && side2== side3){
            System.out.println("Its a Equilateral Triangle");
        }
        else if(side1==side2 || side2==side3 || side3==side1 ){
            System.out.println("Its a Isosceles Triangle");
        }
        else {
            System.out.println("Its a Scalene Triangle");
        }
    }

}
