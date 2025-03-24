package Forloop;

public class Ex21_For_Continue {
    public static void main(String[] args) {
        for (int i=1; i<=10; i++ )
        { if (i%2==0) {
            // To print Even numbers
            System.out.println("Even number is : " + i);
            // continue is to Skip
            continue;
        }
            {
                // To print Odd numbers
                System.out.println("Odd Number is : " + i);

            }
    }
}}
