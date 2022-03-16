package oops;

public class StaticExample {

	int a; //non static
	static int b; //statc
	
	static void m1() {
		System.out.println("This is m1 - static method");
	}
	
	void m2() {
		System.out.println("This is m2 - Non-static method");
	}
	
	void m3() { //non static
		a=500;
		b=1050;
		m1();
		m2();
	}
	
	public static void main(String[] args) {
		
		b=100;
		System.out.println(b);
		m1();
		StaticExample se= new StaticExample();
		se.a=200;
		System.out.println("a " + se.a);
		se.m2();
		se.m3();

	}

}
