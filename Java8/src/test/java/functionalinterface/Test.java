package test.java.functionalinterface;

public class Test {

	public static void main(String[] args) {
		
		MyFInterface add = (x,y) -> x+y;
		MyFInterface subtract = (x,y) -> x-y;
		MyFInterface multiply = (x,y) -> x*y;
		
		System.out.println("Add: " + add.operation(9, 5));
		System.out.println("Subtract: " + subtract.operation(9, 5));
		System.out.println("Multiply: " + multiply.operation(9, 5));		
	}
	
	public static int multiple(MyFInterface add) {
		return add.operation(5, 2);
	}

}
