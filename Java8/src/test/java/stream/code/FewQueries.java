package test.java.stream.code;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import test.java.entity.Employee;

public class FewQueries {

	public static void main(String[] args) {
		
		List<Employee> employeeList = Employee.getListOfEmployees();


//		1. Print the name of all organizations
		getDepartmentNames(employeeList);
		
//		2. how many Males and Females Employee in list
		getCountOfMaleFemaleEmployee(employeeList);

//		3. Print average age of Male and Female Employee
		getAverageAgeOfMaleFemaleEmployee(employeeList);
		
		
//		4. Get the highest paid Employee detail
		getHighestPaidEmployee(employeeList);
		
//		5. Get the Employee joined after year 2000
		getEmployeeJoinedAfter(employeeList, 2000);
		
//		6. Get the average salary of each department
		getAverageSalaryByDepartment(employeeList);
		
//		7. Get the youngest male Employee 
		getYoungestMaleEmployee(employeeList);
		
//		7. Get the youngest Male and Female Employee 
		getYoungestMaleFemaleEmployee(employeeList);
	}

	private static void getDepartmentNames(List<Employee> employeeList) {
		employeeList.stream().map(Employee::getDepartment).distinct().forEach(System.out::print);		
	}

	private static void getCountOfEmployeeinEachDepartment(List<Employee> employeeList) {
		Map<String, Long> deptEmployeeCountMap = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

		Set<Entry<String, Long>> entrySet = deptEmployeeCountMap.entrySet();
		for (Entry<String, Long> entry : entrySet) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

	private static void getCountOfMaleFemaleEmployee(List<Employee> employeeList) {
		Map<String, Long> employeeGenderMap = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println("\nCount of Employee " + employeeGenderMap);
	}

	private static void getAverageAgeOfMaleFemaleEmployee(List<Employee> employeeList) {
		Map<String, Double> AverageAgeOfMaleFemaleEmployee = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
		System.out.println("Average age: " + AverageAgeOfMaleFemaleEmployee);
	}

	private static void getHighestPaidEmployee(List<Employee> employeeList) {
//		emp = employeeList.stream().max((e1,e2) -> e1.getSalary() > e2.getSalary());
		Optional<Employee> emp = employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
		System.out.println("Highest paid employee: " + emp.get().toString());
	}

	private static void getEmployeeJoinedAfter(List<Employee> employeeList, int year) {
		System.out.println("\nEmployee joined after year "+year);
		employeeList.stream().filter(e -> e.getYearOfJoining()>year).collect(Collectors.toList()).forEach(System.out::println);
		System.out.println("\n");
		
	}

	private static void getAverageSalaryByDepartment(List<Employee> employeeList) {
		Map<String, Double> averageSalaryByDepartment = 
				employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
		averageSalaryByDepartment.entrySet().stream().forEach(x -> System.out.println("\nDept: " + x.getKey() + "  \nAvg Salary:" +x.getValue()));
		
	}

	private static void getYoungestMaleEmployee(List<Employee> employeeList) {
		Optional<Employee> emp = employeeList.stream().filter(e -> e.getGender().equals("Male"))
		.collect(Collectors.minBy(Comparator.comparingInt(Employee::getAge)));
		System.out.println("\nYoungest Employee \nName: " + emp.get().getName()+ " \nAge: " + emp.get().getAge());
		
	}

	private static void getYoungestMaleFemaleEmployee(List<Employee> employeeList) {
		employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.minBy(Comparator.comparingInt(Employee::getAge))))
		.forEach((x,y) -> System.out.println("GENDER: " + x + "   NAME: " + y.get().getName() + "  AGE: " + y.get().getAge()));
		
	}
}
