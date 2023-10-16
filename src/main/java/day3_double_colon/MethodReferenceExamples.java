package day3_double_colon;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferenceExamples {
    public static void main(String[] args) {

        System.out.println("============= Consumer =============");
        Consumer<Integer> print = n -> System.out.println(n);
        print.accept(10);

        Consumer<Integer> print2 = System.out::println; // it is the same as line 8's lambda
        print2.accept(5);

        System.out.println("============= Function =============");
        Function<String, String> toLower = s -> s.toLowerCase();
        System.out.println(toLower.apply("JAVA"));

        Function<String, String> toLower2 = String::toLowerCase; // this is the same as line 15's lambda
        System.out.println(toLower2.apply("HELLO"));

        System.out.println("============= Supplier =============");
        Supplier<Double> randomNum = () -> Math.random();
        System.out.println(randomNum.get());

        Supplier<Double> randomNum2 = Math::random;
        System.out.println(randomNum2.get());

        System.out.println("============= BiFunction =============");
        BiFunction<String, Integer, String> sub = (str, i) -> str.substring(i);
        System.out.println(sub.apply("friday", 3));

        BiFunction<String, Integer, String> sub2 = String::substring;
        System.out.println(sub2.apply("sunday", 4));

    }
}
