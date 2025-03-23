package Forloop;

public class Ex_For_Loop_Even_odd {
    public static void main(String[] args) {
        for(int i=0; i<=100; i++)
        {
             /*To find odd number use if (i%2==1) To find Even number use if(i%2==0)*/
            if(i%2==0){
            System.out.println(i+" Is Even Number");}
            else{
                System.out.println(i+" Is Odd Number");
            }
        }
    }
}
