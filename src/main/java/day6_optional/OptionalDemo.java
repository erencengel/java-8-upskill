package day6_optional;

import java.util.List;
import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {

        System.out.println("======== empty Optional ========");
        Optional<String> empty = Optional.empty(); // this method uses/creates an empty Optional object - it is still an object
        System.out.println(empty);

        Optional<String> empty2 = null; // there is no object here
        System.out.println(empty2);

        // so far these cause exceptions
        //System.out.println(empty.get()); // NoSuchElementException
        //System.out.println(empty2.get()); // NullPointerException

        System.out.println("======== isPresent ========");
        System.out.println(empty.isPresent()); // this gives false because there is no value
        //System.out.println(empty2.isPresent());
        System.out.println(Optional.of("java").isPresent());
        System.out.println(Optional.ofNullable(empty2).isPresent()); // this checks for an empty Optional

        System.out.println("======== findAny ========");

        List<Integer> nums = List.of(3, 5, 1, 5, 10, 284, 23, 28, 48);

        Optional<Integer> lessThan300 = nums.stream()
                .filter(p -> p < 300)
                .findAny();
        System.out.println(lessThan300);
        System.out.println(lessThan300.get());
        System.out.println("======== findAny - oppisite ========");

        Optional<Integer> moreThan300 = nums.stream()
                .filter(p -> p > 300)
                .findAny();
        System.out.println(moreThan300);
        //System.out.println(moreThan300.get()); // can't get anything from empty

        System.out.println("======== ifPresent ========");
        Optional<Integer> moreThan300Again = nums.stream()
                .filter(p -> p > 300) // to check invalid you can use 300 instead
                .findAny();
        moreThan300Again.ifPresent(System.out::println);

        System.out.println("======== orElse ========");
        Optional<Integer> moreThan3 = nums.stream()
                .filter(p -> p > 250) // to check invalid you can use 300 instead
                .findAny();
        System.out.println(moreThan3.orElse(-1));


    }
}
