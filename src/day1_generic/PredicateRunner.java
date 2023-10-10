package day1_generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PredicateRunner {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(4, 2, 6, 3, 34, 2, 4, 1, 5, 2, 7));
    }

    public static void mathFunc(List<Integer> list, NumberPredicate<Integer> numberPredicate){
        for(int each : list){
            if(numberPredicate.test(each)){
                System.out.println(each);
            }
        }
    }

}

/*
		create a class to run the code
		create a List with some numbers
		create a generic method that will perform a number functionality on a List
			method(List, NumberPredicate)

 */
