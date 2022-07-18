import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        huang h = (a1)-> {
            System.out.println("a1");
        };
        huang2 h2 = () -> {
            System.out.println("a2");
        };
        huang3 h3 = (a3) ->{
           return a3;
        };
        System.out.println(h3.add3("a3"));

        huang4 h4 = ((a4, b) -> {
            System.out.println("a4");
            return "a4";});

     //    Comparator 2参数 int

        List<Integer> list = Arrays.asList(1,2);
        System.out.println(list.stream());

        int[] num = {1,2,3};
        System.out.println(Arrays.stream(num));

        System.out.println(Stream.of(2,4));

        Stream.generate(()->Math.random() * 10 ).forEach(System.out::println);

        // limit 打印前三个  skip 跳过前面
    }
}
