@FunctionalInterface
interface Itest {
	void testFunc();	
}
// class TestImpl implements Itest {

// }


public class FunctionalInterfaces {
	
	public static void main(String[] args) {
		Itest javaTest = () -> System.out.println("An example");
		javaTest.testFunc();
	}
}