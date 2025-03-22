package Task;

import java.util.Scanner;

public class Ex_Name_Age_Salary_Scanner {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.print("Enter the Name : ");
        String Name = scanner.nextLine();

        System.out.print("Enter the Age : ");
        int Age = scanner.nextInt();

        System.out.print("Enter the Salary : ");
        double Salary = scanner.nextDouble();

        System.out.println("Your Salary is "+ Salary);
        System.out.println("Your Name is : "+ Name);
        System.out.println("Your Age is : "+ Age);

        scanner.close();
    }
}
