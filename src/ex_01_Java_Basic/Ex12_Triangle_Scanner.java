package ex_01_Java_Basic;

import java.util.Scanner;

public class Ex12_Triangle_Scanner {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the Side1 length : ");
        int side1 = scanner.nextInt();
        System.out.println("Enter the Side2 length : ");
        int side2 = scanner.nextInt();
        System.out.println("Enter the Side3 length : ");
        int side3 = scanner.nextInt();
        //Write a program that classifies a triangle based on its side lengths.
        // Given three input values representing the lengths of the sides, determine if the triangle is equilateral (all sides are equal),
        // isosceles (exactly two sides are equal), or scalene (no sides are equal).
        // Use an if-else statement to classify the triangle.

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
