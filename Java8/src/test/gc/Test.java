package test.gc;

public class Test {
	
	static Test t;
	static int count = 0;

	public static void main(String[] args) throws InterruptedException {
		Test t1 = new Test();
		t1 = null;
		System.gc();
		Thread.sleep(20);
		t = null;
		System.gc();
		System.out.println("Count: " + count);

	}
	
	@Override
	public void finalize() {
		count++;
	}
	
	void go() {
		
	}
	

}
