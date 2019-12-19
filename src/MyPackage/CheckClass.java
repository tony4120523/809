package MyPackage;

public class CheckClass {
    // 並沒有 implement [Comparable / Comparator]
    public static int checkValue(String s1, String s2) {
        return s1.length() - s2.length();
    }
}
