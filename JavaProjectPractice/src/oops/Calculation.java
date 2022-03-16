package oops;

public class Calculation {

	int a;
	int b;
	
	//method may not take parameters
	void sum() {
		System.out.println(a + b);
	}
	//method takes parameters
	void add(int a, int b) {
		System.out.println(a+b);
	}
	//method returns some value
	int subtract(int a, int b) {
		return a-b;
	}
	
	
	public static void main(String[] args) {
		Calculation cal = new Calculation();
		cal.a=100;
		cal.b=200;
		cal.sum();
		//Method takes parameters
		cal.add(5, 6);
		//Method return some value
		System.out.println(cal.subtract(6, 4));
				
		

	}

}
