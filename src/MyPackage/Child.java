package MyPackage;

public class Child extends Super {
    Child(int x) {
        super();
        // this();  this line will cause compile error
    }

    Child() {};

    public static void main(String[] args) {
        new Child(0);
    }
}
