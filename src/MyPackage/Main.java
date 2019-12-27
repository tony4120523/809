package MyPackage;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        // 測試 CheckClass
        // String[] strArray = new String[]{"Tiger", "Rat", "Cat", "Lion"};
        // Arrays.sort(strArray, CheckClass::checkValue);  // 若參照的 method 一定要是 static 才行，否則會有 compile error
        // for (String s : strArray) {
        //     System.out.println(s + " ");
        // }


        // 測試 enum USCurrency
        // USCurrency usCoin = USCurrency.SHELDON;
        // System.out.println(usCoin.getValue());


        // 測試 stream.mapToInt() 用法
        // List<String> list = Arrays.asList("Joe", "Paul", "Alice", "Tom");
        // System.out.println (
        //     // list.stream().filter(x -> x.length() > 3).mapToInt(x -> x).count()  這邊 String 是不能轉為 int 的
        //     list.stream().filter(x -> x.length() > 3).count()  // 要這樣子才對
        // );


        // 測試 findFirst()，找到符合的就不繼續往下找
        List<String> str = Arrays.asList("my", "pen", "is", "your", "pen");
        Predicate<String> test = s -> {
            int i = 0;
            boolean result = s.contains("pen");
            System.out.print(i++ + " : ");
            return result;
        };
        str.stream()
                .filter(test)
                .findFirst()
                .ifPresent(System.out::print);

    }
}
