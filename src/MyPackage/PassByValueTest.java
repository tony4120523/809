package MyPackage;

import java.util.HashMap;
import java.util.Map;

public class PassByValueTest {
    public static void main(String[] args) {
        // testPrimitive();
        testReference();
    }

    private static void testReference() {
        Map<String, Integer> map = new HashMap<>();
        map.put("1", 100);
        map.put("2", 200);

        modify(map);
        System.out.println(map);
    }

    private static void modify(Map<String, Integer> map) {
        // map = new HashMap<>();
        map.put("3", 300);
    }

}
