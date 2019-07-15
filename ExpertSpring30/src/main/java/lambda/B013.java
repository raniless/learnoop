package lambda;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class B013 {

	public static void main(String[] args) {
		Integer[] ages = {20, 15, 18, 27, 30, 21, 17, 19, 34, 28};

		Predicate<Integer> predicate = age -> age < 20;
		Consumer<Integer> consumer = age -> System.out.format("Age %d!!! Can't enter\n", age);

		Arrays.stream(ages).filter(predicate).forEach(consumer);
		/*
		Arrays.stream(ages)
			.filter(age -> age < 20)
			.forEach(age -> System.out.format("Age %d!!! Can't enter\n", age));
		*/
	}
}
