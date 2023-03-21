import java.nio.channels.ReadableByteChannel;

class Quadrilateral {
    private int breadth;
    private int length;

    // constructor
    Quadrilateral() {}
    Quadrilateral(int b, int l) {
        this.breadth = b;
        this.length = l;
    }
    Quadrilateral(double b, double l) {
        this.length = (int)l;
        this.breadth = (int)b;
    }

    // show data
    public void showDimensions() {
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
    }

    // getter methods
    public int getLength(){ return this.length ;}
    public int getBreadth() { return this.breadth; }

}

class Rectangle extends Quadrilateral {

    // constructor
    Rectangle(int length, int breadth) {
        super(breadth , length);
    }
    Rectangle(double length, double breadth) {super(breadth , length);}
    public int perimeter()  {
        return 2*(this.getBreadth() + this.getLength());
    }
    public int area() {
        return this.getLength() * this.getBreadth();
    }
}

class Cube extends  Quadrilateral {
    private int height;
    Cube(){} // non parameterized
    Cube(int l, int b, int h ) {
        super(b,l);
        height = h;
    }
    Cube(double l, double b, double h) {
        super(b, l);
        this.height = (int) h;
    }
    public int getHeight() {
        return this.height;
    }
    public int volume() {
        return this.getLength() * this.getBreadth() * this.getHeight();
    }
    @Override
    public void showDimensions() {
        super.showDimensions();
        System.out.println("Height: " + height);
    }
}

public class QuadTest {
    public static void  main(String [] args) {

        System.out.println("Dimensions of Rectangle: ");
        Rectangle rect1 = new Rectangle(3.4, 9.7);
        Rectangle rect2 = new Rectangle(11, 34);

        rect1.showDimensions();
        System.out.println("Area of rectangle: " + rect1.area());
        System.out.println("Perimeter of rectangle: " + rect1.perimeter());
        System.out.println("-------");
        rect2.showDimensions();
        System.out.println("Area of rectangle: " + rect2.area());
        System.out.println("Perimeter of rectangle: " + rect2.perimeter());
        System.out.println("-------");

        System.out.println("Dimensions of cube: ");
        Cube cube1 = new Cube(3,3,3);
        Cube cube2 = new Cube(9.99 , 8.99, 9.99);

        cube1.showDimensions();
        System.out.println("Volume of Cube: " + cube1.volume());
        System.out.println("-------");
        cube2.showDimensions();
        System.out.println("Volume of Cube: " + cube2.volume());
        System.out.println("-------");

    }
}
