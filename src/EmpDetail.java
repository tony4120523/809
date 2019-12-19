import java.util.Arrays;
import java.util.List;

public class EmpDetail {

    public static void main(String[] args) {
        // 就是普通的三個字串，下條件，排序
        List<String> empDetail = Arrays.asList("100, Robin, HR",
                "200, Mary, AdminServices",
                "101, Peter, HR");

            empDetail.stream()
            .filter(s -> s.contains("1"))
            .sorted()
            .forEach(System.out::println);
    }

}
