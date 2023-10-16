package day4_streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamDemos {
    public static void main(String[] args) {

        System.out.println("================= Stream source =================");
        int[] arr = {3, 1, 5, 2, 5, 2, 1, 5};
        System.out.println(Arrays.stream(arr)); // we created a Stream from the array. only printing it so far

        List<Integer> list = new ArrayList<>(Arrays.asList(3, 5, 1, 4, 12, 3, 1, 3, 5, 12, 5));
        System.out.println(list.stream()); // we created a Steam from a List. only printing it so far

        System.out.println("================= Intermediate Operations =================");

        System.out.println("================= distinct =================");
        System.out.println(list.stream().distinct()); // this still returns a Stream, so we can't see anything by printing it like this. we need a terminal operation

        list.stream().distinct().forEach(System.out::println); //.forEach(n -> System.out.println(n));

        System.out.println("================= filter =================");
        list.stream()
                .filter(p -> p % 2 == 0)
                .forEach(System.out::println);

        System.out.println("================= filter with distinct =================");
        list.stream()
                .distinct()
                .filter(p -> p % 2 == 1)
                .forEach(System.out::println);

        System.out.println("================= limit =================");
        list.stream()
                .limit(5)
                .forEach(System.out::println);

        System.out.println("================= limit - get the first 6 numbers that are less than 4 =================");
        list.stream()
                .filter(p -> p < 4)
                .limit(6)
                .forEach(System.out::println);





    }
}
