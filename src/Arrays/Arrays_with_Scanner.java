package Arrays;

import java.util.Scanner;

public class Arrays_with_Scanner {
    public static void main(String[] args) {
        Scanner marks= new Scanner(System.in);
        System.out.println("Enter the Size");
        int size = marks.nextInt();

        int[] numbers_marks= new int[size];
        for (int i = 0; i < numbers_marks.length; i++) {
            System.out.println("Enter the Marks");
           numbers_marks[i]= marks.nextInt();
        }
        System.out.println("______");
        for (int i = 0; i <numbers_marks.length ; i++) {
            System.out.println(numbers_marks[i]);
        }
    marks.close();
    }
}
