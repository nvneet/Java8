package test.java.special.ds;

import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueSort {

	public static void main(String[] args) {
		
		PriorityQueue<Student> studentQ = new PriorityQueue<>();
		studentQ.addAll(List.of(
				new Student("Ashish", 5),
				new Student("Barun", 3),
				new Student("Manish", 6),
				new Student("Souvik", 1),
				new Student("Rahul", 4),
				new Student("Meenal", 2)
		));
		Iterator<Student> stIterator = studentQ.iterator();
		while (stIterator.hasNext()) {
			System.out.println(studentQ.poll().toString());
		}
	}

}
