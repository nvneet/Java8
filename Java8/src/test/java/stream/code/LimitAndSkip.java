package test.java.stream.code;

import java.util.List;

public class LimitAndSkip {

	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);
		List<Integer> integers = List.of(11,5,13,44,25,96,87,38,19,10,11,12,13,14,15);
		
		System.out.println("numbers LIMIT: ");
		numbers.stream().limit(5).forEach(x -> System.out.print(x + "  "));
		
		System.out.println("\n\nintegers LIMIT: ");
		integers.stream().limit(5).forEach(x -> System.out.print(x + "  "));
		
		
		System.out.println("\n\nnumbers SKIP: ");
		numbers.stream().skip(5).forEach(x -> System.out.print(x + "  "));
		
		System.out.println("\n\nintegers SKIP: ");
		integers.stream().skip(5).forEach(x -> System.out.print(x + "  "));

	}

}
