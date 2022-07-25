package test.java.stream.code;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergingStreamsOfIntegers {

	public static void main(String[] args) {
		List<Integer> list1 = List.of(1,3,5,7,9,11,13,15,17,19,21);
		List<Integer> list2 = List.of(2,4,6,8,10,12,14,16,18,20,22);
		
		System.out.println("merged");
		//merged
		Stream.of(list1.stream(),list2.stream())
			.flatMap(x -> x)
			.collect(Collectors.toList())
			.forEach(System.out::print);
		
		System.out.println("\n\nmerged and sorted ascending order");
		// merged and sorted ascending order
		Stream.of(list1.stream(),list2.stream())
			.flatMap(x -> x)
			.collect(Collectors.toList())
			.stream()
			.sorted()
			.forEach(x -> System.out.print(x + " "));
		
		System.out.println("\n\nmerged and sorted descending order");
		// merged and sorted ascending order
		Stream.of(list1.stream(),list2.stream())
			.flatMap(x -> x)
			.collect(Collectors.toList())
			.stream()
			.sorted(Collections.reverseOrder())
			.forEach(x -> System.out.print(x + " "));		
	}
}
