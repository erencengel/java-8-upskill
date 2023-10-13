package day_double_colon;

import java.util.*;

public class ComparatorExample {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(Arrays.asList(4, 2, 1, 6, 21, 5, 2, 10, 14));
        nums.forEach(System.out::println);

        System.out.println("----------- sort in ascending order ----------- ");
        Collections.sort(nums);
        nums.forEach(System.out::println);

        System.out.println("----------- sort in descending order ----------- ");
        Collections.sort(nums, (n1, n2) -> n1 > n2 ? -1 : n1 < n2 ? 1 : 0);
        nums.forEach(System.out::println);

        System.out.println("----------- sort in ascending order again ----------- ");
        Collections.shuffle(nums);
        nums.sort((n1, n2) -> n1.compareTo(n2)); // by default sort method is in ascending
        nums.forEach(System.out::println);

        System.out.println("----------- sort in descending order again ----------- ");
        Collections.shuffle(nums);
        nums.sort((n2, n1) -> n1.compareTo(n2));
        nums.forEach(System.out::println);

        System.out.println("----------- best way for descending ----------- ");
        Collections.shuffle(nums);
        nums.sort(Comparator.reverseOrder()); // sort the opposite of natural order (ascending)
        nums.forEach(System.out::println);

        // summary: to sort in ascending order we just use sort(), and to sort in descending we can call the reverseOrder() method from Comparator

    }
}
