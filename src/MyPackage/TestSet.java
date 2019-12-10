package MyPackage;

import java.util.HashSet;
import java.util.Set;

public class TestSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("one");
        set.add("two");
        set.add("three");
        set.add("three");
        for (String item : set) {
            System.out.println("Item: " + item);
        }
    }
}
