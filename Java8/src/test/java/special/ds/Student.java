package test.java.special.ds;

public class Student implements Comparable<Student>{
	
	private int rank;
	private String name;
	
	public Student(String name, int rank) {
		super();
		this.rank = rank;
		this.name = name;
	}

	@Override
	public int compareTo(Student student) {

		if(rank < student.rank)
			return -1;
		else if (rank > student.rank)
			return 1;		
		return 0;
	}
	
	@Override
	public String toString() {
		String result = "Student name: " +name+",  rank: " +rank;
		return result;
	}
}
