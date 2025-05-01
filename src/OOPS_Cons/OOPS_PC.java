package OOPS_Cons;

public class OOPS_PC {
    public static void main(String[] args) {
        Students c1=new Students();//object1
        System.out.println(c1.Grade);

        Students c2=new Students("Raja",6, 389); //Object2
        System.out.println(c2.Name);

        Students c3=new Students("Gokul",9, 59); //Object3
        System.out.println(c3.Id);

    }
}
class Students{
    String Name;
    int Grade;
    int Id;

    //DC
    Students(){
        Name="Jaysu";
        Grade=18;
        Id= 5656;
    }

        //PC
        Students(String Name, int Grade, int Id){
            this.Name=Name;
            this.Grade=Grade;
            this.Id=Id;

    }

}