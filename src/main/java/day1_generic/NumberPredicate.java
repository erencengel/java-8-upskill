package day1_generic;

public interface NumberPredicate<T> {
    boolean test(T t);
}
/*
		create an interface NumberPredicate<T>
		create an abstract method test()
			parameter: T
			return: boolean
 */
