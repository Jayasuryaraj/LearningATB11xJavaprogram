package Arrays;

public class Array_Sum_ForEach {
    public static void main(String[] args) {
        int[] numbers = {24,78,56,28};
        int sum=0;
        for (int n : numbers){
            sum = sum+n;
        }
        System.out.println(sum);
    }
}
