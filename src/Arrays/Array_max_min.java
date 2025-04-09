package Arrays;

public class Array_max_min {
    public static void main(String[] args) {
        int[] marks={10,90,70,76,80,93,83, 78};

    int max_marks= give_max(marks);
        System.out.println(max_marks);
    }

    private static int give_max(int[] marks) {
        int max = marks[0];
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] > max) {
                max = marks[i];
            }
        }
        return max;}}
