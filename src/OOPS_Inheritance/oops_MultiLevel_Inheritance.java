package OOPS_Inheritance;

public class oops_MultiLevel_Inheritance {
    public static void main(String[] args) {

        //Objects have to be created in separate class in Automation for better readability.....!

        //Grandfather--Object1
        GrandFather GF=new GrandFather();
        GF.GF();
        System.out.println("___");

        //father--Object2
        Father F=new Father();
        F.GF();
        F.F();

        //Son--Object3
        System.out.println("___");
        Son S=new Son();
        S.GF();
        S.F();
        S.S();

    }}
