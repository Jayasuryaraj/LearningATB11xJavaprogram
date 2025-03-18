package ex_01_Java_Basic;

import java.util.Scanner;

public class Ex_10_EvenOdd_If {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Number = ");
        int number = scanner.nextInt();

        // If gien numbers reminder is 0, its a Even number else Odd
        if (number %2 ==0)
        {
            System.out.println("Given Number is Even");
        }
        else
        {
            System.out.println("Given Number is Odd");
        }
      }}
