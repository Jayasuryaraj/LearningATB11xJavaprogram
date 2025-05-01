    package Ex17_OOPs_Interface;

    public class Ex_Interface {
    public static void main(String[] args) {
        Rectangle r1= new Rectangle();
        r1.area(10,20);

        Square s1= new Square();
        s1.area(14,0);
    }
    }

    interface Polygon{
        void area(int length, int Breadth);
    }

    class Square implements Polygon{

        @Override
        public void area(int length, int Breadth) {
            System.out.println("Area of square is: "+(length*length));
        }
    }

    class Rectangle implements Polygon{

        @Override
        public void area(int length, int Breadth) {
            System.out.println("Size of Rectangle is :"+(length*Breadth));
        }
    }