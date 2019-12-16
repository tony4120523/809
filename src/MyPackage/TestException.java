package MyPackage;

public class TestException {
    // static 在 public 前面是可以的
    static public void main(String[] args) {
        System.out.println("start");
        try {
            int i = 1 / 0;
            System.out.println("try");
        } catch (Exception e) {
            System.out.println("catch");
            throw e;  // throw e，不會做 after
        } finally {
            System.out.println("finally");
        }
        System.out.println("after");
    }
}
