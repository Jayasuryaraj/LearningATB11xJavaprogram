package Arrays;

import java.util.Scanner;

public class Array_Matrix_Multiply {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int val= scanner.nextInt();

        for (int i = 0; i <val ; i++) {
            for (int j = 0; j <val ; j++) {
                System.out.print(i+ "x" + j+ "=" + (i*j)+"\t");

            }
            System.out.println(" ");
        }
    }
}
