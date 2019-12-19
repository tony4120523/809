package MyPackage;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 測試 CheckClass
        String[] strArray = new String[]{"Tiger", "Rat", "Cat", "Lion"};
        Arrays.sort(strArray, CheckClass::checkValue);  // 若參照的 method 一定要是 static 才行，否則會有 compile error
        for (String s : strArray) {
            System.out.println(s + " ");
        }
    }
}
