import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
//		D d1 = (D) new B();
		D d2 = new D();
		
		List list = new ArrayList<>();
        list.add("hello");
        list.add(2);
        System.out.print(list.get(0) instanceof Object);
        System.out.print(list.get(1) instanceof Integer);

//        int a = 123451234512345;
        int a = 2147483647;
        System.out.println("\n"+Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println("a: " + a);
	}
}
