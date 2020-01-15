package MyPackage;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;
import java.util.stream.IntStream;

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
        // List<String> str = Arrays.asList("my", "pen", "is", "your", "pen");
        // Predicate<String> test = s -> {
        //     int i = 0;
        //     boolean result = s.contains("pen");
        //     System.out.print(i++ + " : ");
        //     return result;
        // };
        // str.stream()
        //         .filter(test)
        //         .findFirst()
        //         .ifPresent(System.out::print);


        // 測試 AutoCloseable, try-catch；
        // try 可以不配 catch；main 可以 throws Exception，相當於不處理 Exception
        // 不然就在這裡用 catch 處理
        // try (Folder f = new Folder()) {
        //     f.open();
        // } catch (Exception e) { }


        // 測試 IntFunction，應改成下面那樣
        // IntStream stream = IntStream.of(1, 2, 3);
        // IntFunction<Integer> inFu = x -> y -> x * y; // line n1
        // IntStream newStream = stream.map(inFu.apply(10)); // line n2
        // newStream.forEach(System.out::print);
        // IntStream stream = IntStream.of(1, 2, 3);
        // IntFunction<IntUnaryOperator> inFu = x -> (y -> x - y); // line n1，兩層的運算
        // IntStream newStream = stream.map(inFu.apply(10)); // line n2，x 代入 10, y 分別代入 123
        // newStream.forEach(System.out::print); // 結果為 '987'


        // 測試 Comparator.comparing, result: Optional[20]
        // List<Integer> nums = Arrays.asList(10, 20, 8);
        // System.out.println (
        //         nums.stream().max(Comparator.comparing(a -> a))
        // );


        // 測試子類別放入 Array 的方式, result: java.lang.ArrayStoreException: MyPackage.BaseTwo
        Base[] baseArr = new BaseOne[3]; /* new Base[3]; compiles and result: 3 */
        baseArr[0] = new BaseOne();
        baseArr[2] = new BaseTwo();
        System.out.println(baseArr.length);
    }
}
