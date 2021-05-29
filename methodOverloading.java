class methodOverloading {

	static void foo()	{
		System.out.println("Good Morning bro!");
	}

	static void foo(int a)	{
		System.out.println("Good morning " + a + "bro!");
	}

	static void foo(int a, int b)	{
		System.out.println("Good morning " + a + "bro!");
		System.out.println("Good morning " + b + "bro!");
	}

	static void foo(int a, int b, int c) {
		System.out.println("Good morning " + a + "boo!");
		System.out.println("Good morning " + b + "boo!");
		System.out.println("Good morning " + c + "boo!");
	}

	public static void main(String args[])	{
		foo();
		foo(3000);
		foo(4000, 5000);


		System.out.println("\n This is what we call compile time polymorphism aka Function Overloading.");
		System.out.println("\n NOTE - METHOD OVERLOADING CANNOT BE PERFORMED BY CHANGING RETURN TYPE OF THE METHOD.");
	}


}