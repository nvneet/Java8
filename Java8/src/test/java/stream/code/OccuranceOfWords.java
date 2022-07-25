package test.java.stream.code;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccuranceOfWords {

	public static void main(String[] args) {

		String str = "Welcome Code Decode Code Interview Welcome Decode Code You Welcome Man";
		List<String> wordList1 = List.of( str.split(" "));
		List<String> wordList2 = Arrays.asList(str.split(" "));
		
		Map<String, Long> freqMap = wordList1.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(freqMap);
		
//		freqMap.forEach((x,y) -> System.out.println(x + ": " + y));
		Map<String, Long> freqMap2 = wordList2.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(freqMap2);
//		freqMap2.forEach((x,y) -> System.out.println(x + ": " + y));
		
		System.out.println(getOccurancesOfIntegers());
		System.out.println(getOccurancesOfString());
		
		getOccurancesOfIntegers().forEach((x,y) -> System.out.println(x + ":  " + y)); 
		System.out.println("\n\n");
		getOccurancesOfString().forEach((x,y) -> System.out.println(x + ":  " + y)); 
		
	}
	
	public static Map<Integer, Long> getOccurancesOfIntegers() {
		List<Integer> numList = Arrays.asList(5,3,4,1,3,7,2,9,9,4);
		Map<Integer, Long> groupedNums = numList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		return groupedNums;
	}
	
	public static Map<String, Long> getOccurancesOfString() {
		List<String> strList = Arrays.asList("Amanda","Rob","Sunny","Amanda","Rob");
		Map<String, Long> groupedStr = strList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		return groupedStr;
	}
}
