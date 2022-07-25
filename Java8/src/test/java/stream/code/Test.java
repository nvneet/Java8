package test.java.stream.code;

import java.util.List;

public class Test {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(1, 3, 4, 2, 1, 6, 7, 5, 3, 3, 4);
//		Stream.of(1, 3, 4, 2, 1, 6, 7, 5, 3, 3, 4);
		
		NumbersOperations.findDuplicateBySetAdd(numbers).forEach(System.out::print);
		System.out.println("\nDifference between Max and Min number is: " + NumbersOperations.getDifferenceMaxMinNumber(numbers));


	}

}
