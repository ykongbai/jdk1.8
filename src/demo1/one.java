package demo1;

import java.util.Comparator;
import java.util.function.*;


public class one {
    public static void main(String[] args) {
//      lambda是函数试接口实例
        // 接口只有一个抽象方法
        Runnable runnable = () -> System.out.println("jdk8");
        new Thread(runnable).start();
            // 一个参数 无返回值
        Consumer<String> consumer = (x) -> System.out.println(x);
        consumer.accept("100");
            // 没有参数 有返回值
        Supplier supplier = () -> {return "s";}; System.out.println(supplier.get());
            // 一个参数  有返回值
        Function function = (b) -> {return 1;};System.out.println(function.apply(args));
        Function<String,Integer> function1 = (b2) -> {return 2;};System.out.println(function1.apply("k"));
            // 一个参数  boolean
        Predicate predicate = (xx) ->{return 4<6;};System.out.println(predicate.test(args));
            // 二个参数  int
        Comparator<Integer> comparator = (x1,x2) -> {return x1 > x2 ? 1 : 0;};
        System.out.println(comparator.compare(4,2));
//     方法引用
        Consumer supplier1 = System.out::println;

        Comparator<Integer> com = Integer::compare;

        BiPredicate<String,String> biPredicate = (a1,b1) -> { return a1.equals(b1);};
        BiPredicate<String,String> biPredicate1 = String::equals;
//      构造引用
        Function<Integer,Integer[]> function2 = Integer[]::new;
    }
}