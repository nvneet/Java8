package test.java.entity;

import java.util.List;

public class Employee {

	int id;
	String name;
	int age;
	String gender;
	String department;
	int yearOfJoining;
	double salary;

	public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getYearOfJoining() {
		return yearOfJoining;
	}

	public void setYearOfJoining(int yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public static List<Employee> getListOfEmployees() {
		return List.of(new Employee(111, "Jiva Brian", 32, "Female", "HR", 2011, 25000.0),
				new Employee(122, "Paul Scholes", 54, "Male", "Sales and Marketting", 1990, 195000.0),
				new Employee(133, "Martin Luther", 53, "Male", "Security and Transport", 1991, 62000.0),
				new Employee(144, "Neha Sharma", 52, "Female", "Account and Finance", 1997, 61000.0),
				new Employee(155, "Manoj Jindal", 51, "Male", "Infrastructure", 1996, 58000.0),
				new Employee(166, "Shyama Sundar", 50, "Male", "HR", 1995, 57000.0),
				new Employee(177, "Wang Lui", 31, "Female", "Sales and Marketting", 2010, 66000.0),
				new Employee(188, "Navneet Mishra", 26, "Male", "Dev", 2011, 71000.0),
				new Employee(199, "Meenal Chauhan", 39, "Female", "HR", 2001, 63000.0),
				new Employee(211, "Nusrat Beghum", 40, "Female", "Infrastructure", 2002, 52000.0),
				new Employee(222, "Manohar Vajpayee", 41, "Male", "Account and Finance", 2003, 46000.0),
				new Employee(233, "Komal Paswan", 49, "Female", "Account and Finance", 2004, 36000.0),
				new Employee(244, "Kumud Mishra", 33, "Female", "HR", 2005, 26000.0),
				new Employee(255, "Abhishek Jha", 34, "Male", "Sales and Marketting", 1995, 24000.0),
				new Employee(266, "Mohak Jain", 35, "Female", "HR", 1994, 34000.0),
				new Employee(277, "Anand Srivastava", 38, "Male", "Sales and Marketting", 1993, 45000.0),
				new Employee(288, "Kamlesh Singh", 45, "Male", "Dev", 1998, 85000.0),
				new Employee(299, "Sudhansu Shekhar", 27, "Male", "Dev", 20012, 35000.0),
				new Employee(311, "Jiya Shreshth", 28, "Female", "HR", 2013, 29000.0));
	}
	
	@Override
	public String toString() {
		return  " ID:" + id + 
				" NAME:" + "\""+ name +"\"" +
				" AGE:" + age +
				" GENDER:" + gender +
				" DEPARTMENT:" + "\""+ department +"\"" +
				" YEARofJOINING:" + yearOfJoining +
				" SALARY:" + salary;
	}

}
