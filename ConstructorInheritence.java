class Baseclass {

	//default constructor
	public Baseclass() {
		System.out.println("Base class is created.");
	}

	//parameterized constructor
	public Baseclass(String arg) {
		this(123); //one constructor calling the other.....
		System.out.println("Base class is created with String arg " + arg);
	}

	//parameterized constructor
	public Baseclass(int arg) {
		System.out.println("Base class is created with int arg " + arg);
	}

}

class Derivedclass extends Baseclass{

	public Derivedclass() {
		super(" String args");
		//super(123);
		System.out.println("Derived class is created");
	}
}

public class ConstructorInheritence {
	public static void main(String args[]) {
		Derivedclass c1 = new Derivedclass();
	}
}