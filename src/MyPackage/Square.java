package MyPackage;

public class Square extends Shape {
    int a;
    Square(int a) {
        /* insert code here */  /* super();  寫跟沒寫都一樣 */
        this.a = a;
    }
    public void area() { System.out.println("Square");}
}
