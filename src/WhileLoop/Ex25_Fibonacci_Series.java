package WhileLoop;

import java.util.Scanner;

public class Ex25_Fibonacci_Series {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the Number :");
        int number= scanner.nextInt();

        int factorial= 1;
        if (number <=0){
            System.out.println("factorial");
    } else {
        for (int i=1; i<=number; i++) {
          /*fact= 1*1 =1(fact);
          fact= 1*2 = 2
          fact = 2*3 =6
          fact =  6*4=24
          fact = 24*5=120
            */
            factorial = factorial * i ;

    }}
        System.out.println("factorial of the given number is : "+ factorial);
}
}
