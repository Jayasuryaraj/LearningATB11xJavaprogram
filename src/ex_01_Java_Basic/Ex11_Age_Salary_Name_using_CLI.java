package ex_01_Java_Basic;

public class Ex11_Age_Salary_Name_using_CLI {
    public static void main(String[] args) {
        String Age = args[0];
        String Salary = args[1];
        String Name = args[2];

        System.out.println("Your Name is : "+ Name);
        System.out.println("Your Age is : "+ Age);
        System.out.println("Your Salary is "+ Salary);
    /*
    Or

    public static void main(String[] args) {
        String Age = args[0];
        String Salary = args[1];
        String Name = args[2];

        System.out.println("Your Name is : "+ Name+"\n" + "Age is : " +Age+"\n" + "Salary is : " +Salary);


     */

    }
}
