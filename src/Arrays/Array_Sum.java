package Arrays;

public class Array_Sum {
    public static void main(String[] args) {
        int[] numbers = {20,67,54};
        int sum=0;


        System.out.println("----");
        for (int i = 0; i < numbers.length; i++) {
            sum= sum + numbers[i];
           //System.out.println(sum);
        }
        System.out.println(sum); //this will give final output
    }
}
