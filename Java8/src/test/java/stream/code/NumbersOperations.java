package test.java.stream.code;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NumbersOperations {

	public static void filterNonUniqueNumbers() {
		List<Integer> numbers = List.of(1, 3, 4, 2, 1, 6, 7, 5, 3, 3, 4);
		HashMap<Integer, Integer> data = new HashMap<>();
		HashMap<Integer, Integer> freqMap = new HashMap<>();
		int count = 0;
		for (int num : numbers) {
			if (data.containsKey(num)) {
				freqMap.put(num, num);
			} else
				data.put(num, count);
		}

		for (Integer key : freqMap.keySet()) {
			System.out.println(freqMap.get(key));
		}
	}

	public static int getDifferenceMaxMinNumber(List<Integer> numbers) {
		// Get Min or Max Number
		Integer maxNumber = numbers.stream().max(Comparator.comparing(Integer::valueOf)).get();
		Integer minNumber = Stream.of(1, 3, 4, 2, 1, 6, 7, 5, 3, 3, 4).min(Comparator.comparing(Integer::valueOf))
				.get();

		int diff = maxNumber - minNumber;
		return diff;
	}

	public static <T> Set<T> findDuplicateBySetAdd(List<T> list) {
		Set<T> items = new HashSet<>();
		return list.stream().filter(n -> !items.add(n)) // Set.add() returns false if the element was already in the set.
				.collect(Collectors.toSet());
	}

	public static <T> Set<T> findDuplicateByFrequency(List<T> list) {
		return list.stream().filter(i -> Collections.frequency(list, i) > 1).collect(Collectors.toSet());
	}
}
