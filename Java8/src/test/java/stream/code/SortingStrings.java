package test.java.stream.code;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortingStrings {

	public static void main(String[] args) {


		List<String> list = Arrays.asList("John", "Mark", "Robert", "Lucas", "Brandon");
		List<String> sortedList = list.stream().sorted().collect(Collectors.toList());

		System.out.println(sortedList);

	}

}
