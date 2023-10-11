package day2_functional_interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FunctionalInterfaceExamples {
    public static void main(String[] args) {

        System.out.println("-------- Predicate ---------");
        Predicate<Integer> lessThan10 = n -> n < 10;
        System.out.println(lessThan10.test(5));

        List<Integer> nums = new ArrayList<>(Arrays.asList(23, 5, 21, 5, 2, 2, 1, 6, 22));
        // remove all the odd numbers
        nums.removeIf(n -> n % 2 == 1);
        System.out.println(nums);

        // palindrome
        Predicate<String> isPalindrome = s -> new StringBuilder(s).reverse().toString().equals(s);
        System.out.println(isPalindrome.test("racecar"));
        System.out.println(isPalindrome.test("hello"));

        System.out.println("-------- Consumer ---------");
        // print the first char of a String
        Consumer<String> firstChar = str -> System.out.println(str.charAt(0));
        firstChar.accept("Java");

        List<String> names = new ArrayList<>(Arrays.asList(
                "Kelly", "James", "Eren", "Huong", "Oleg", "Salma"
        ));

        names.forEach(s -> System.out.print(s + " "));
        System.out.println();
        names.forEach(s -> System.out.println(s.charAt(0) + " " + s.charAt(s.length() - 1)));

        System.out.println("-------- BiConsumer ---------");

        BiConsumer<Integer, Integer> sum = (n1, n2) -> System.out.println(n1 + n2);
        sum.accept(5, 1);

        BiConsumer<List<String>, Integer> subNames = (namesList, end) -> {
            for(String each : namesList){
                System.out.println(each.substring(0, end));
            }
        };
        subNames.accept(names, 3);


    }

}
