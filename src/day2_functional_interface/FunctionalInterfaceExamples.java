package day2_functional_interface;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.function.*;

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

        Map<String, String> holidays = new HashMap<>();
        holidays.put("July", "4th Of July");
        holidays.put("October", "Halloween");
        holidays.put("December", "Christmas");
        holidays.forEach((k, v) -> System.out.println(k + " " + v));

        System.out.println("-------- Function ---------");

        // parameter is String and return type it Integer
        Function<String, Integer> countVowels  = str -> {
            String vowels = "aeiou";
            int numOfVowels = 0;
            for(char each : str.toCharArray()){
                if(vowels.contains(each + "")){
                    numOfVowels++;
                }
            }
            return numOfVowels;
        };

        System.out.println(countVowels.apply("wooden spoon"));
        System.out.println(countVowels.apply("Mississippi"));

        // convert int[] to a List

        Function<int[], List<Integer>> convertToList = arr -> {
            List<Integer> list = new ArrayList<>();
            for(int each : arr){
                list.add(each);
            }
            return list;
        };

        int[] a = {4, 2, 4, 1, 5, 2};
        List<Integer> aList = convertToList.apply(a);
        System.out.println(aList);

        System.out.println("-------- Supplier ---------");
        Supplier<String> getDay = () -> LocalDate.now().getDayOfWeek().name();
        System.out.println(getDay.get());

        Supplier<String> getDateTime = () -> LocalDateTime.now().format(DateTimeFormatter.ofPattern("M/d/y h:m a"));
        System.out.println(getDateTime.get());

        Supplier<Integer> getRandomNumber = () -> new Random().nextInt(1001);
        System.out.println(getRandomNumber.get());


    }

}
