package MyPackage;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class PeekPrint {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Jim", "John", "Jeff");
        Function<String, String> func = s -> "Hello: ".concat(s);

        list.stream()
                .map(func)
                .peek(System.out::print);
                // .count();  沒有這個的話，會不印出結果
                // 不然就用 forEach 也可以印出結果
    }
}
