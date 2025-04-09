package Arrays;

public class Arrays_Ex {
    public static void main(String[] args) {
        int[] marks={90,70,76,80,93,83};
        System.out.println(marks.length);
        System.out.println(marks[5]);
        //System.out.println(marks[-1]);

        String[] name = {"Raja","Jaysu","Surya"};
        System.out.println(name[0]);
        System.out.println(name[2]);

        String[] Students= new String[4];
        Students[0]= "Jayasu";
        Students[1]= "Ganesh";
        Students[2]= "Vijay";
        Students[3]= "Ajith";
        System.out.println(Students.length);
        System.out.println(Students[3]);
    }
}
