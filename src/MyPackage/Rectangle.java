package MyPackage;

public class Rectangle extends Square {
    int b, c;
    Rectangle(int b, int c) {
        /* insert code here */  super(b);
        this.b = b; this.c = c;
    }
    public void area() { System.out.println("Rectangle"); }
}
